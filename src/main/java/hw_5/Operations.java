package hw_5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Operations {
    public static void create() {
        // CREATE
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student student = new Student("Ivan", 5);
        System.out.println(student);
        session.save(student);
        System.out.println(student);
        session.getTransaction().commit();
        sessionFactory.close();
    }


    public static void read() {
        // READ
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student studentFromDb = session.get(Student.class, 1L);
        System.out.println(studentFromDb);
        session.getTransaction().commit();
        sessionFactory.close();
    }

    public static void update() {
        // UPDATE
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student studentFromDbUpd = session.get(Student.class, 2L);
        System.out.println(studentFromDbUpd);
        studentFromDbUpd.setMark(2);
        System.out.println(studentFromDbUpd);
        session.getTransaction().commit();
        sessionFactory.close();
    }


    public static void massCreation() {
        // MASS CREATION
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        for (int i = 0; i < 10; i++) {
            int a = 0;
            int b = 5;
            int randomMark = a + (int) (Math.random() * b);
            String[] namesList = new String[]{"Peter", "Vasia", "Oleg", "Dima", "Kon"};
            int n = (int) Math.floor(Math.random() * namesList.length);
            Student studentAuto = new Student(namesList[n], randomMark);
            session.save(studentAuto);
        }
        session.getTransaction().commit();
        sessionFactory.close();
    }


    public static void delete() {
        // DELETE
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Student deleteStudent = session.get(Student.class, 2L);
        session.remove(deleteStudent);
        session.getTransaction().commit();
        sessionFactory.close();
    }


}
