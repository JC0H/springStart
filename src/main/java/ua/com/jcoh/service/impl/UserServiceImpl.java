package ua.com.jcoh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.jcoh.dao.UserDAO;
import ua.com.jcoh.entity.User;
import ua.com.jcoh.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void save(String name) {
        if (!name.isEmpty() || name != null){
            userDAO.save(new User(name));
        }
    }
}
