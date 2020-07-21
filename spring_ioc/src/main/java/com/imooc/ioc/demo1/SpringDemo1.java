package com.imooc.ioc.demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

/**
 * Created by jt
 */
public class SpringDemo1 {

    @Test
    /**
     * 传统方式开发
     */
    public void demo1(){
        // UserService userService = new UserServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        // 设置属性:
        userService.setName("张三3");
        userService.sayHello();
    }

    @Test
    /*
        Spring的方式实现
     */
    public void demo2(){
        //创建Spring的工厂
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类：
        UserService userService=(UserService) applicationContext.getBean("userService");

        userService.sayHello();
    }

    @Test
    /*
    创建水果bean
     */
    public void demo4Food(){
        //创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂获得类
        FoodService foodService = (FoodService) applicationContext.getBean("foodService");

        foodService.eat();
    }

}
