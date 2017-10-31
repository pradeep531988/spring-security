package com.dsp.web.dao.users;

import java.util.List;

import com.dsp.web.model.users.RememberMeToken;

/**
 * @author Pradeep
 */
public interface RememberMeTokenRepsitoryCustom {

    RememberMeToken findBySeries(String series);
    List<RememberMeToken> findByUsername(String username);

}

