package org.acme.rest.client;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class SantaClausService {

    @Inject
    EntityManager em;

    @Transactional
    public List<Gift> findAllGifts() {
        return em.createQuery("SELECT gift FROM Gift as gift", Gift.class).getResultList();
    }
}