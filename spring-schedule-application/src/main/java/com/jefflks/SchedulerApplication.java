package com.jefflks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchedulerApplication {

	public static void main(String[] args) {

		String springConfig = "scheduler-task.xml";

		@SuppressWarnings({ "resource", "unused" })
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
	}

}
