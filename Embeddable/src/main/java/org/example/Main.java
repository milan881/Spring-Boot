package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("Hp");
        l1.setModel("Pavillion");
        l1.setRam("16");

        Aline a1 = new Aline();

        a1.setaId(1);
        a1.setaName("Milan");
        a1.setaTech("Java");
        a1.setLaptop(l1);
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Aline.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(a1);

    }

}