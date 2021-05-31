package nshin.spring.annotation;

import org.springframework.stereotype.Component;

import nshin.spring.beans.HelloSpring5Bean03;

@Component("jpn")
public class HelloSpring5Bean07Jpn implements HelloSpring5Bean03 {
	
	public void sayHello(String msg) {
		System.out.println("こんにちは, " + msg);
	}
}
