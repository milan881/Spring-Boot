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
        /*
        s1.setId(58); // ID must be unique
        s1.setName("Milan Raja");
        s1.setAge(25);
        */
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        s1 = session.get(Student.class,58);

        Transaction transaction = session.beginTransaction();
        //merge => it helps us t update the data base table => it also work as a save update query
        //save update query => means is the data is not present in the data base it will insert as a new record
        //session.merge(s1);

        //remove => it helps us to delete the record from the data base
        
        session.remove(s1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);

    }
}