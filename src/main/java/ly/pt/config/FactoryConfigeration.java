package ly.pt.config;

import ly.pt.entity.Parent;
import ly.pt.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigeration {
    private static FactoryConfigeration factoryConfigeration;
    private SessionFactory sessionFactory;

    private FactoryConfigeration(){
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Parent.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfigeration getInstance(){
        return (factoryConfigeration == null) ? factoryConfigeration = new FactoryConfigeration():factoryConfigeration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
