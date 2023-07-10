package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("applicationContex.xml");
        TestBean testBean = contex.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());
        contex.close();

    }
}
