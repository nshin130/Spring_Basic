package nshin.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import nshin.spring.beans.HelloSpring5Bean03;

public class HelloSpring5App06 {

	// 스프링 프레임 워크 두번째 사례
	
	// Bean Factory가 아닌 ApplicationContext로 
	// DI를실행해봄
			
	// 추가라이브러리
	// spring-context
	// spring-expression
	
		
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/bean05.xml");
		
				
		HelloSpring5Bean03 bean = (HelloSpring5Bean03) ctx.getBean("kor");
		bean.sayHello("스프링5");
		
		bean = (HelloSpring5Bean03) ctx.getBean("eng");
		bean.sayHello("Spring5");
		
		bean = (HelloSpring5Bean03) ctx.getBean("jpn");
		bean.sayHello("スプリング 5");
				
	}

}
