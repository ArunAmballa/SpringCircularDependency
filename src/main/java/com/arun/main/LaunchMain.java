package com.arun.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.arun.beans.Alpha;
import com.arun.beans.Beta;



public class LaunchMain 
{
	
	public static void main(String args[])
	{
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Alpha AlphaObj=context.getBean("al",Alpha.class);
		
		Beta BetaObj=context.getBean("be",Beta.class);
	}

}
