package com.hibernate.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
  public static void main(String[] args) {

    // Hibernate Configuration
    Configuration cfg = new Configuration();
    cfg.addAnnotatedClass(Alien.class);
    cfg.addAnnotatedClass(Student.class);
    cfg.configure();

    SessionFactory sf = cfg.buildSessionFactory();
    Session session = sf.openSession();

    // Start transaction
    org.hibernate.Transaction tx = session.beginTransaction();

    // ------------------ 1. CREATE ------------------
    /*
     * Laptop l1 = new Laptop();
     * l1.setBrand("Razer");
     * l1.setModel("Blade 16");
     * l1.setYear(2018);
     * 
     * Alien a1 = new Alien();
     * a1.setAid(5); // primary key
     * a1.setTech("lua");
     * a1.setAname("Prime");
     * a1.setLaptop(l1);
     * session.persist(a1); // Save new record
     */

    // ------------------ 2. READ ------------------

    // 2.1 Read by primary key
    Alien a = session.get(Alien.class, 3);
    System.out.println("Alien with ID 3: " + a);

    // 2.2 Read all rows
    List<Alien> allAliens = session.createSelectionQuery("from Alien", Alien.class).getResultList();
    System.out.println("\nAll aliens:");
    allAliens.forEach(System.out::println);

    // 2.3 Read based on column value (aname)
    Alien alienNamedPrime = session.createSelectionQuery("from Alien where aname = :name", Alien.class)
        .setParameter("name", "Prime")
        .setMaxResults(1)
        .getSingleResultOrNull();
    System.out.println("\nAlien named Prime: " + alienNamedPrime);

    // 2.4 Read by multiple conditions (aname + year)
    Alien alienCondition = session
        .createSelectionQuery("from Alien where aname = :name and laptop.year = :yr", Alien.class)
        .setParameter("name", "Prime")
        .setParameter("yr", 2016)
        .setMaxResults(1)
        .getSingleResultOrNull();
    System.out.println("\nAlien with name 'Prime' and year 2016: " + alienCondition);

    // ------------------ 3. UPDATE ------------------

    // 3.1 Update by primary key (automatic dirty checking)
    // Alien updateAlien = session.get(Alien.class, 1);
    // if (updateAlien != null) {
    // updateAlien.setTech("TypeScript"); // Hibernate will track this change
    // }

    //// 3.2 Update using mutation query (JPQL)
    // int updated = session.createMutationQuery("update Alien set tech = :t where
    //// aname = :n")
    // .setParameter("t", "Dart")
    // .setParameter("n", "Prime")
    // .executeUpdate();
    // System.out.println("\nAliens updated with name Prime: " + updated);

    // ------------------ 4. DELETE ------------------

    // 4.1 Delete by primary key
    // Alien toDelete = session.get(Alien.class, 3);
    // if (toDelete != null) {
    // session.remove(toDelete); // Hibernate 6 uses `remove()` instead of
    // `delete()`
    // }

    //// 4.2 Delete by column value
    // int deleted = session.createMutationQuery("delete from Alien where aname =
    //// :name")
    // .setParameter("name", "Prime")
    // .executeUpdate();
    // System.out.println("\nDeleted rows with name Prime: " + deleted);

    // 4.3 Delete all rows (truncate)
    // session.createMutationQuery("delete from Alien").executeUpdate();

    // ------------------ 5. ADVANCED QUERIES ------------------

    // 5.1 Get all aliens where laptop.year >= 2020
    List<Alien> newLaptops = session.createSelectionQuery("from Alien where laptop.year >= 2020", Alien.class)
        .getResultList();
    System.out.println("\nAliens with laptops from 2020 or newer:");
    newLaptops.forEach(System.out::println);

    // 5.2 Count number of aliens using JavaScript
    Long count = session.createSelectionQuery("select count(*) from Alien where tech = :tech", Long.class)
        .setParameter("tech", "JavaScript")
        .getSingleResult();
    System.out.println("\nCount of Aliens using JavaScript: " + count);

    // Commit transaction and close session
    tx.commit();
    session.close();
    sf.close();
  }
}
