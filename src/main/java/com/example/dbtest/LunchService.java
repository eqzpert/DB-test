package com.example.dbtest;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped @Named @Transactional
public class LunchService {

    @PersistenceContext
    private EntityManager em;

    public LunchEntity findLunch(int id){
        return em.find(LunchEntity.class, id);
    }
}
