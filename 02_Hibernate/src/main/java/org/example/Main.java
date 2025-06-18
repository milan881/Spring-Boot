package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Student.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        //get => it help us to retrive the data from the database
        s2 = session.get(Student.class,12);

        session.close();
        sf.close();
        System.out.println(s2);

    }
}