package org.example.module_8_database.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class CreateTeacher {
    public static void main(String[] args) {
        // defined database configuration and created session factory object
        Configuration configuration = new Configuration();
        configuration.configure(new File("src/main/java/org/example/module_8_database/hibernate/hibernate.cfg.xml"));
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // step1: start session
        Session session = sessionFactory.openSession();

        // step2: start transaction
        Transaction transaction = session.beginTransaction();

        // step3: database operation
        Teacher data1 = new Teacher("ram", 25);
        session.save(data1);

        // step4: flushing session, committing transaction and closing
        session.flush();
        transaction.commit();
        session.close();

    }
}
