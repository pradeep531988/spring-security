package com.dsp.web.dao.users;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dsp.web.model.users.RememberMeToken;

/**
 * @author Pradeep
 */
@Repository
@Transactional(readOnly = true)
public class RememberMeTokenRepsitoryCustomImp implements RememberMeTokenRepsitoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public RememberMeToken findBySeries(String series) {
        List<RememberMeToken> records = entityManager.createQuery("FROM RememberMeToken where series?", RememberMeToken.class)
                .setParameter(1, series).getResultList();
        if (records.get(0) != null) {
            return records.get(0);
        }
        return null;
    }

    @Override
    public List<RememberMeToken> findByUsername(String username) {
        List<RememberMeToken> records = entityManager.createQuery("FROM RememberMeToken where username?", RememberMeToken.class)
                .setParameter(1, username).getResultList();
        return records;
    }

}

