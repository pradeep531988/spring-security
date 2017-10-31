package com.dsp.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * @author Pradeep
 */
@Service
@Configuration
public class SystemSettings {  

    public static final String DS_URL = "datasource.app.url";
    public static final String DS_USERNAME = "datasource.app.username";
    public static final String DS_PASSWORD = "datasource.app.password";
    public static final String DS_DRIVER_CLASS = "datasource.driverClassName";

    @Autowired
    private Environment env;

    public String get(String key) {
        return env.getProperty(key);
    }

}
