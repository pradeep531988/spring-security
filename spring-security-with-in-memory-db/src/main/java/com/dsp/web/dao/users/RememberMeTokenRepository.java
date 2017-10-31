package com.dsp.web.dao.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsp.web.model.users.RememberMeToken;

/**
 * @author Pradeep
 */
@Repository
public interface RememberMeTokenRepository extends JpaRepository<RememberMeToken, String>, RememberMeTokenRepsitoryCustom {
}

