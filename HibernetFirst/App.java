package Hibernet.HibernetFirst;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration config=new Configuration().configure().addAnnotatedClass( RestaurantMgt.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		session.beginTransaction();
		
		
		
		session.getTransaction().commit();
		session.close();
    }
}
