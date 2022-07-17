package com.prowings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Hello massage = ctx.getBean("hello", Hello.class);
        System.out.println(massage);
        
        Student std = ctx.getBean("std", Student.class);
        System.out.println(std);
    
        Employee emp = ctx.getBean("emp", Employee.class);
        System.out.println(emp);
    }
}
