package org.mahanth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Developer developer = (Developer)context.getBean("developer");
//        Developer developer2 = (Developer)context.getBean(Developer.class);
        developer.build();
//        developer.setAge(21);// Instead we are setting the value using spring framework
//        System.out.println(developer.getAge());

    }
}
