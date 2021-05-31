package nshin.spring.annotation;

import org.springframework.stereotype.Component;

import nshin.spring.beans.HelloSpring5Bean03;

@Component("eng")
public class HelloSpring5Bean07Eng implements HelloSpring5Bean03 {
	
	public void sayHello(String msg) {
		System.out.println("Hello, " + msg);
	}
}
