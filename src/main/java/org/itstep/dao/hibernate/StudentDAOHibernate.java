package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.itstep.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


public class StudentDAOHibernate  {

//    private final SessionFactory sessionFactory;
//
//    @Autowired
//    public StudentDAOHibernate(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//
//    @Override
//    public void add(Student student) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.merge(student);
//        transaction.commit();
//        session.close();
//    }
//
//    @Override
//    public void update(Student student) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.update(student);
//        transaction.commit();
//        session.close();
//    }
//
//    @Override
//    public void delete(Student student) {
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(student);
//        transaction.commit();
//        session.close();
//    }
//
//    @Override
//    public Student findById(Integer id) {
//        Session session = sessionFactory.openSession();
//        //session.byId(Student.class).load(id);
//        return session.get(Student.class, id);
//    }
//
//    @Override
//    public List<Student> findAll() {
//        Session session = sessionFactory.openSession();
//        return (List<Student>) session.createQuery("from Student").list();
//    }
}
