/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hashthrims.repository.jpa.impl;

import com.hashthrims.domain.traininglist.MentoringSession;
import com.hashthrims.repository.jpa.MentoringSessionDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author boniface
 */

@Repository("mentoringSessionDAO")
@Transactional
public class MentoringSessionDAOJPAImpl  implements MentoringSessionDAO{

    @PersistenceContext(type=PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public MentoringSession find(Long id) {
        return em.find(MentoringSession.class, id);
    }

    @Override
    public void persist(MentoringSession entity) {
        em.persist(entity);
    }

    @Override
    public void merge(MentoringSession entity) {
        em.merge(entity);
    }

    @Override
    public void remove(MentoringSession entity) {
        MentoringSession acc =em.find(MentoringSession.class, entity.getId());
        em.remove(acc);
    }

    @Override
    public List<MentoringSession> findAll() {
        return (List<MentoringSession>) em.createQuery("SELECT a FROM MentoringSession a").getResultList();
    }

    @Override
    public List<MentoringSession> findInRange(int firstResult, int maxResults) {
        return em.createQuery("SELECT a from MentoringSession a").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }

    @Override
    public long count() {
         return (Long) em.createQuery("SELECT count(a) FROM MentoringSession a").getSingleResult();
    }

    @Override
    public MentoringSession getByPropertyName(String propertyName, String propertyValue) {
        List<MentoringSession> list = em.createQuery("SELECT e FROM  MentoringSession e WHERE e." + propertyName + "=?1").setParameter(1, propertyValue).getResultList();
        return (list.isEmpty()) ? null : list.get(0);
    }

    @Override
    public List<MentoringSession> getEntitiesByProperName(String propertyName, String propertyValue) {
          List<MentoringSession> list = em.createQuery("SELECT e FROM  MentoringSession e WHERE e." + propertyName + "=?1").setParameter(1, propertyValue).getResultList();
        return list;
    }

}
