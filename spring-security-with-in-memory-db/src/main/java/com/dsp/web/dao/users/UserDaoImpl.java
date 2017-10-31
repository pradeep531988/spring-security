package com.dsp.web.dao.users;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import com.dsp.web.model.users.User;

/**
 * @author Pradeep
 */

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public User findByUserName(String username) {


        List<User> users = new ArrayList<User>();

        users = entityManager.createQuery("from User where username=?").setParameter(1, username).getResultList();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }

    }

}