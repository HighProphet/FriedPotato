package com.friedpotato.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by HighProphet on 2015/9/2.
 */
public class DBTool {

    private static SessionFactory factory;

    static {
        Configuration cfg = new Configuration().configure();
        factory = cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return factory.openSession();
    }
}
