package nshin.spring.annotation;

import org.springframework.stereotype.Repository;

import nshin.spring.sungjuk.SungJuk;
import nshin.spring.sungjuk.SungJukDAO;

@Repository("sdao")
public class SungJukDAOImpl implements SungJukDAO {

	@Override
	public void insertSungJuk(SungJuk sj) {
		System.out.println("성적 추가됨");
		

	}

}
