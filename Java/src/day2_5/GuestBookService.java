package day2_5;

import java.util.ArrayList;

// 처리하는 클래스 -> 객체 생성 X

public class GuestBookService {
	private ArrayList<GuestBook> list = new ArrayList<>();
	
	public static void save(GuestBook gb) {
		for(GuestBook gb:list) {
			if(gb.getGno().equals(gno)) {
				return gb;
			}
		}
		return null;
	}
}
