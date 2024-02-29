package day3_4;

import java.util.ArrayList;
import java.util.List;

import lombok.Setter;

//================== com.world.tire 패키지 =============================
class 타이어 {
	
}
class 한국타이어 extends 타이어 {
	
}
class 넥센타이어 extends 타이어 {
	
}

@Setter
class 렌트카 {
	private String 제조사;
	private Long 배기량;
	private Tire tire;
}

public class Liskov치환원칙Test3 {
	public static void main(String[] args) {
		렌트카 car = new 렌트카();
		// 실제로 사용하는 타이어는 브릿지스톤(실제로는 자식 객체를 사용)
		// 참조변수는 항상 부모를 사용한다.
		car.setTire(new 브릿지스톤());
		
		List list = new ArrayList();
	}
}
