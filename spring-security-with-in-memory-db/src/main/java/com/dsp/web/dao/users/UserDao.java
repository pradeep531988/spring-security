package com.dsp.web.dao.users;

import com.dsp.web.model.users.User;

/**
 * @author Pradeep
 */
public interface UserDao {

	User findByUserName(String username);

}