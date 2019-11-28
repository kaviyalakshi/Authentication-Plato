package com.pyt.jdbctemp.pdf.config;

import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { HibernateCallback.class, WebSecurityConfig.class };
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfigurerAdapter.class };
    }
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}