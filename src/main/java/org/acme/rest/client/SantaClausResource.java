package org.acme.rest.client;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/santa")
public class SantaClausResource {

    final SantaClausService santaClausService;

    @Inject
    public SantaClausResource(SantaClausService santaClausService) {
        this.santaClausService = santaClausService;
    }

    @GET
    @Path("/gift")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Gift> getAllGifts() {
        return this.santaClausService.findAllGifts();
    }
}