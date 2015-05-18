package com.springinaction.springidol;

import static java.lang.System.setProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DukeTest {

	public static void main(String[] args) {
		setProperty("STANS_SONG", "Total Eclipse of the Heart");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		Performer performer = (Performer)ctx.getBean("kenny2");
//		Performer performer = (Performer)ctx.getBean("duke");
		try {
			performer.perform();
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
	}
}
