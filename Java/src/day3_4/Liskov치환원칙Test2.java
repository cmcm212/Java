package day3_4;

import lombok.AllArgsConstructor;

// ================== com.world.tire 패키지 =============================
class Phone {
	
}
class I아이폰14 extends Phone {
	
}
class I아이폰15 extends Phone {
	
}

// =================== com.world.car 패키지 =================================

@AllArgsConstructor
class Saram {
	private Phone phone;
}

public class Liskov치환원칙Test2 {
	// 구체적인 클래스를 사용하면 코드가 1번예제처럼 난리난다.
	// 추상적인 부모 클래스로 작업해야 한다.
	public static void main(String[] args) {
		Car car = new Car();
		car.setTire2(new 넥센타이어());
		System.out.println(car.getTire1());
		System.out.println(car.getTire2());
	}
}