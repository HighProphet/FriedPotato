package com.friedpotato.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by HighProphet on 2015/9/2.
 */
@SuppressWarnings("deprecation")
public class DBTool {

    static {
        Configuration cfg = new Configuration().configure();
        factory = cfg.buildSessionFactory();
    }

    private static SessionFactory factory;

    public static Session getSession() {
        return factory.openSession();
    }
}
