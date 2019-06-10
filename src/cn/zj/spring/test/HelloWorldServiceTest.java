package cn.zj.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zj.spring.service.HelloWorldService;

public class HelloWorldServiceTest {

	@Test
	public void say() {
		//创建一个ApplicationContext对象，根据xml配置创建一个对象
		//直接读取Spring的src目录下的配置文件的子类是ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorldService helloWorldService = context.getBean("helloWorldService", HelloWorldService.class);
		//调用方法
		helloWorldService.say();
	}

}