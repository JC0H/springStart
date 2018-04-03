package ua.com.jcoh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.com.jcoh.dao.UserDAO;
import ua.com.jcoh.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory factory;

    public void setFactory(SessionFactory factory) {
        this.factory = factory;
    }

    public void save(User user){
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        factory.close();
    }
}
