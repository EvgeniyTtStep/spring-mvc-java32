package org.itstep.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.itstep.model.Student;
import org.itstep.util.HibernateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.itstep.util.HibernateUtil.openSession;

@Repository
public class StudentDAO implements BaseEntity<Student, Integer> {

    @Override
    public void add(Student student) {
        Session session = openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
    }

    @Override
    public void update(Student student) {
        Session session = openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(student);
        transaction.commit();
    }

    @Override
    public void delete(Student student) {
        Session session = openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
    }

    @Override
    public Student findById(Integer id) {
        Session session = openSession();
        return session.get(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        Session session = openSession();
        List fromStudent = session.createQuery("from Student").list();
        session.close();
        return fromStudent;
    }
}
