package com.SpringMavProj.springProj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
    	//read spring config file
    	AnnotationConfigApplicationContext context =
    			new AnnotationConfigApplicationContext(SportConfig.class);
    	
    	// get the bean from spring container
    	Coach theCoach = context.getBean("swimCoach" , Coach.class);
    	
    	//call a method on the bean
    	System.out.println(theCoach.getDailyWorkOut());
    	System.out.println(theCoach.getDailyFortune());
    	
        //close context 
    	context.close();
    	
    	
    }
}
