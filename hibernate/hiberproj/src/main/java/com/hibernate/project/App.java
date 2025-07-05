package com.hibernate.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.transaction.HeuristicMixedException;
import jakarta.transaction.HeuristicRollbackException;
import jakarta.transaction.RollbackException;
import jakarta.transaction.SystemException;

public class App {
  public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException,
      HeuristicMixedException, HeuristicRollbackException, SystemException {
    Laptop l1 = new Laptop();
    l1.setBrand("Asus");
    l1.setModel("zephyrus");
    l1.setYear(2021);

    Alien a1 = new Alien();

    a1.setAid(03);
    a1.setTech("C++");
    a1.setAname("Danish");
    a1.setLaptop(l1);

    Configuration cfg = new Configuration();
    cfg.addAnnotatedClass(com.hibernate.project.Student.class);
    cfg.addAnnotatedClass(com.hibernate.project.Alien.class);
    cfg.configure();
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    org.hibernate.Transaction transaction = session.beginTransaction();
    session.persist(a1);
    transaction.commit();
    session.close();
    sf.close();

  }
}
