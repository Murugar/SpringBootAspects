package com.iqmsoft.boot.aop;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.iqmsoft.boot.aop.logger.LogUtil;
import com.iqmsoft.boot.aop.logger.Loggable;
import com.iqmsoft.boot.aop.logger.LoggingHandler;
import com.iqmsoft.boot.aop.rest.SpringBootAspectJController;


@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(SpringBootAspectJController.class);
        register(LogUtil.class);
        register(Loggable.class);
        register(LoggingHandler.class);
    }
}
