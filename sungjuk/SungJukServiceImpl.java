package nshin.spring.sungjuk;

public class SungJukServiceImpl implements SungJukService {

	private SungJukDAO sdao;
	
	// sjdao에 대한 객체를 불러오기 위해 생성자 정의
	// 스프링 컨테이너가 sdao 변수에 sjdao객체를 DI해 줌 
	public SungJukServiceImpl(SungJukDAO sdao) {
		this.sdao = sdao;
	}	
	
	//sjdao에 대한 객체를 불러오기위해 setter메서드 정의
	// 스프링 컨테이너가 sdao변수에 객체를 DI해줌
	public void setSdao(SungJukDAO sdao) {
		this.sdao = sdao;
	}



	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk ("혜교", 99, 96, 97);
		System.out.println("성적 생성 됨");
		
		
		sdao.insertSungJuk(sj);
		
		
	}

}
