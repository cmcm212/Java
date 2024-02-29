package day3_6;

import java.util.ArrayList;
import java.util.List;

// 오버라이드 : 부모와 자식이 

/*
	부모의 참조변수로 작업한다
	하지만 자식들의 동작은 자식마다 달라야한다.
		부모는 표준 -> 함수의 이름을 정해준다.
		탈것이 이동하는 방법은 go()야
	자식들은 부모를 상속한다
		Bus, Taxi, 비행기는 super.go()를 가진다.
		이 상황에서 자식이 go()를 다시 만들면 this.go()를 실행한다.
 */
class 탈것 {
	public void go() {
		System.out.println("부모의 go");
	}
}

class Bus extends 탈것 {
	public void go() {
		System.out.println("버스가 달려갑니다.");
	}
}

class Taxi extends 탈것 {
	
}

class 비행기 extends 탈것 {
	public void go() {
		System.out.println("비행기가 날아갑니다.");
	}
}

public class OverrideTest2 {
	public static void main(String[] args) {
		List<탈것> list = new ArrayList<>();
		
		list.add(new Bus());
		list.add(new Taxi());
		list.add(new 비행기());
	}
}
