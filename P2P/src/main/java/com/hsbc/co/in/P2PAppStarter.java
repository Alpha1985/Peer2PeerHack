package com.hsbc.co.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class P2PAppStarter 
{
    public static void main( String[] args )
    {
    	System.out.println("cmd line:: "+args);
		System.out.println("arg:: "+System.getenv("server.port"));
		ApplicationContext ctx = SpringApplication.run(P2PAppStarter.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		
		/*for(String bean:beanNames) {
			System.out.println("Bean Name:: "+bean);
		}*/
    }
}
