package nshin.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nshin.spring.sungjuk.SungJuk;
import nshin.spring.sungjuk.SungJukDAO;
import nshin.spring.sungjuk.SungJukService;

@Service("sjsrv")
public class SungJukServiceImpl implements SungJukService {

	@Autowired
	private SungJukDAO sdao;

	@Override
	public void newSungJuk() {
		SungJuk sj = new SungJuk ("혜교", 99, 96, 97);
		System.out.println("성적 생성 됨");
		
		
		sdao.insertSungJuk(sj);
		
		
	}

}
