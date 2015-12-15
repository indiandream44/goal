package learning.framework.springhibernate.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {

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
        session.beginTransaction();
         
        Category category = new Category("Computer");
        
        Category category2 = new Category("Mens-Wear");
         
        Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
         
        Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
         
        Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
         
        Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
        
        Product leeJeans = new Product("Lee Confort Jeans ", "Dark blue: 30 ", 3000, category2);
         
        Set<Product> products = new HashSet<Product>();
        products.add(pc);
        products.add(laptop);
        products.add(phone);
        products.add(tablet);
         
        category.setProducts(products);
         
        
        Set<Product> mensWearproduct = new HashSet<Product>();
        mensWearproduct.add(leeJeans);
        category2.setProducts(mensWearproduct);
        
        session.save(category);
        session.save(category2) ;
        session.getTransaction().commit();
        session.close();       
    }
}
