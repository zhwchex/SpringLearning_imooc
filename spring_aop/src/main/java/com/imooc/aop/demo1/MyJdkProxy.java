package com.imooc.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/*@note
Proxy.newProxyInstance(参数1，参数2，参数3);
1.类的加载器，
2.类实现的接口
3.InvocationHandler接口，可以使类实现该接口，也可以使用匿名内部类的方式对该接口进行实现
* */
public class MyJdkProxy implements InvocationHandler{
    private UserDao userDao;

    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }

    //加强类 @note
    public Object createProxy(){
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    //advice， JDK动态代理的方法， 加强save方法 @note
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("save".equals(method.getName())){
            System.out.println("权限校验...");
            return method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
