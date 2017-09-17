package myStrutsHelloWorld;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static{
		try{
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.configure("hibernate.cfg.xml").build();
			Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();
		}catch(Throwable th){
			System.err.println("Enitial SessionFactory creation failed" + th);
            throw new ExceptionInInitializerError(th);
		}
	}

	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}


}
