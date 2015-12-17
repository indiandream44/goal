package learning.framework.springhibernate.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MailClassForGet {

	public static void main(String[] args) {
		 // loads configuration and mappings
        Configuration configuration = new Configuration().configure();
        ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
        registry.applySettings(configuration.getProperties());
        ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
         
        // builds a session factory from the service registry
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
         
        // obtains the session
        Session session = sessionFactory.openSession();
        List<Product> products = session.createQuery(" from Product").list();
        
        // List the products
        for(Product product : products){
        	System.out.println(product);
        	System.out.println(product.getCategory().getName());
        }
        session.close();
	}

}
