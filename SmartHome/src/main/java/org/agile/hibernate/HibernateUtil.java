package org.agile.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



public class HibernateUtil {
	private static final SessionFactory sessionFactory;

    private static ServiceRegistry serviceRegistry;

    static {

            try {

                    Configuration configuration = new Configuration();
                    configuration.configure();
                    serviceRegistry = new ServiceRegistryBuilder().applySettings(
                                    configuration.getProperties()).buildServiceRegistry();
                    sessionFactory = configuration.buildSessionFactory(serviceRegistry);

            } catch (Throwable th) {

                    System.err.println("Enitial SessionFactory creation failed" + th);

                    throw new ExceptionInInitializerError(th);

            }

    }

    public static SessionFactory getSessionFactory() {

            return sessionFactory;

    }

}
