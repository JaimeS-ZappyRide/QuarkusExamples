package com.zappyride.software.example.data.access.services;


import com.zappyride.software.example.data.access.entities.PgeComment;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/pge")
@ApplicationScoped
public class PgeService {


    @Inject
    EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String createComment() {
        PgeComment comment = new PgeComment();
        comment.setSuggestions("Hello World");
        em.persist(comment);
        return comment.getSuggestions();
    }
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    @Path("comments")
    public String postCreateComment(PgeComment comment) {
        em.persist(comment);
        return comment.getSuggestions();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Path("comments")
    public List<PgeComment> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<PgeComment> cq = cb.createQuery(PgeComment.class);
        Root<PgeComment> rootEntry = cq.from(PgeComment.class);
        CriteriaQuery<PgeComment> all = cq.select(rootEntry);
        TypedQuery<PgeComment> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    @Path("nqc")
    public List<PgeComment> findAllNQ() {
        TypedQuery<PgeComment> query = em.createNamedQuery("PgeComment.findAll", PgeComment.class);

        return query.getResultList();
    }

}
