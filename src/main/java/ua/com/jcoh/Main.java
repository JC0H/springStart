package ua.com.jcoh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.com.jcoh.service.UserService;
import ua.com.jcoh.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/context.xml");

        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save("fff");
    }
}
