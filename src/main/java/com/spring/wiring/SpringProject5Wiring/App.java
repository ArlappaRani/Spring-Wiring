package com.spring.wiring.SpringProject5Wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        Trainer t1=(Trainer)ctx.getBean("train1");
        System.out.println(t1);
        
        Trainer t2=(Trainer)ctx.getBean("train2");
        System.out.println(t2);
        
        
        KodnestClasses kc=(KodnestClasses)ctx.getBean("kodclass");
        System.out.println(kc);
        
    }
}
