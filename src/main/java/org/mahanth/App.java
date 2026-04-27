package org.mahanth;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Developer developer = (Developer)context.getBean("developer");
//        developer.build();
    }
}
