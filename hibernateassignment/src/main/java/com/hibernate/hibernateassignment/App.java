package com.hibernate.hibernateassignment;

import javax.security.auth.login.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config = new Configuration ();
        
        config.configure("hibernate.cfg.xml");
        
        
        SessionFactory sFactory= config.buildSessionFactory();
        Session session = sFactory.openSession();
        
        
        Transaction transaction = session.beginTransaction();
        session.save(Car);
        transaction.commit();
        session.close();
        sFactory.close();
    }
}
