package nshin.spring.sungjuk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSungJukApp01 {


	public static void main(String[] args) {
		// 스프링으로 구현하는 성적처리프로그램
		// 각 모듈간의 의존성을 낮추기 위해
		// Service, DAO 클래스는 인터페이스 기반으로 작성함
		// Main : SpringSungJukApp01
		// Service : SungJukService-> SungJukServiceImpl
		// DAO : SungJukDAO -> SungJukDAOImpl
		
		// 전체적인 흐름
		// SpringSungJukApp 01 -> SungJukServiceImpl -> SungJukDAOImpl
		// SungJukServcieImpl, SUngjukDAOImpl등을 bean에 등록
		
		ApplicationContext ctx = new FileSystemXmlApplicationContext("src/sungjuk01.xml");
		
		// sungjuk.xml에 의해 스프링 컨테이너가
		// 미리 생성해둔 sjsrv 객체를 가져다 sjsrv변수에 초기화함
		SungJukService sjsrv = (SungJukService) ctx.getBean("sjsrv");
		//sjsrv 변수의 new SungJuk 메서드 호출
		sjsrv.newSungJuk();

	}

}
