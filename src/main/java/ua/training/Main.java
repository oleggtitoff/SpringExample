package ua.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.training.model.entity.User;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.getName());
        System.out.println(user.getSurname());
        System.out.println(user.getAge());

        context.close();
    }

}
