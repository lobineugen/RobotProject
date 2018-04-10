package com.lobin;

import com.lobin.impls.robots.R2D2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml");
//        R2D2 robot1 = (R2D2) context.getBean("r2d1");
//        R2D2 robot2 = context.getBean("r2d2", R2D2.class);
//        robot1.action();
//        robot2.action();
//        R2D2 robot3 = context.getBean("r2d3", R2D2.class);
//        robot3.action();
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml");
        R2D2 robot1 = context.getBean("r2d2",R2D2.class);
        robot1.action();
    }
}
