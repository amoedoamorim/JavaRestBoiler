package com.amoedoamorim.javarestboiler.contextlistener;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;

import com.amoedoamorim.javarestboiler.dao.persistence.PersistenceUtil;

public class AppContextLoaderListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(final ServletContextEvent event) {
        PersistenceUtil.init();
        //super.contextInitialized(event);
    }

    @Override
    public void contextDestroyed(final ServletContextEvent event) {
        PersistenceUtil.close();
        super.contextDestroyed(event);
    }
}
