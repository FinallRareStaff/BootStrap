package ru.kata.spring.boot_security.demo.dao;

import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public User findByUserEmail(String email) {
        return (User) entityManager
                .createQuery("SELECT e FROM User e WHERE e.email=:email")
                .setParameter("email", email)
                .getSingleResult();
    }
}
