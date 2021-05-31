package nshin.spring.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSungJukApp02 {


	public static void main(String[] args) {
	
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/sungjuk02.xml");
		
		// sungjuk.xml에 의해 스프링 컨테이너가
		// 미리 생성해둔 sjsrv 객체를 가져다 sjsrv변수에 초기화함
		SungJukService sjsrv = (SungJukService) ctx.getBean("sjsrv");
		//sjsrv 변수의 new SungJuk 메서드 호출
		sjsrv.newSungJuk();

	}

}
