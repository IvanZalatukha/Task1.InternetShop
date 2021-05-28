package com.zalatukha.patterns.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;

import java.util.List;

public class UserDao {

    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(user);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.update(user);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.delete(user);
            transaction.commit();
            session.close();
        } catch (HibernateException e) {
            transaction.rollback();
        }
    }

    public Passport findPassportById(int id) {
        Passport passport = null;
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.get(Passport.class, id);
            transaction.commit();
        } catch (HibernateException e) {
            transaction.rollback();
        }
        return passport;
    }

    public List<User> findAll() {
        List<User> users = (List<User>) HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User ").list();
        return users;
    }
}
