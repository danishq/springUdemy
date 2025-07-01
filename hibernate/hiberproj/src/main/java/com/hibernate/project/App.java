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
    System.out.println("Hello World!");
    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();
    Student s6 = new Student();

    s1.setRollNo(1);
    s2.setRollNo(2);
    s3.setRollNo(3);
    s4.setRollNo(4);
    s5.setRollNo(5);
    s6.setRollNo(6);

    s1.setsAge(1);
    s2.setsAge(2);
    s3.setsAge(3);
    s4.setsAge(4);
    s5.setsAge(5);
    s6.setsAge(6);

    s1.setsName("Abhishek");
    s2.setsName("Bhanu");
    s3.setsName("Chinmay");
    s4.setsName("Danish");
    s5.setsName("Esha");
    s6.setsName("Farhan");

    Configuration cfg = new Configuration();
    cfg.addAnnotatedClass(com.hibernate.project.Student.class);
    cfg.configure();
    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();
    org.hibernate.Transaction transaction = session.beginTransaction();
    session.save(s6);
    transaction.commit();
    session.close();
    sf.close();
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s5);
    System.out.println(s5);

  }
}
