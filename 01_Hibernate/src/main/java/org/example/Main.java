package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student();
        s1.setId(58); // ID must be unique
        s1.setName("Milan Raja");
        s1.setAge(24);

/*
        Configuration cfg = new Configuration()
                .configure("hibernate.cfg.xml") // Load hibernate.cfg.xml
                .addAnnotatedClass(Student.class); // Register entity class
        //cfg.addAnnotatedClass(Student.class);
  */
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();


        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        //Save is depiricated so we are using persist
        session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();

        System.out.println(s1);
    }
}