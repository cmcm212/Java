package day1_1;

import java.util.ArrayList;

public class TodoService {
	// 데이터베이스 대신 ArrayList
	private ArrayList<Todo> list = new ArrayList<>();
	
	// 할일 추가 메소드
	public void save(Todo todo) {
		list.add(todo);
	}
	// 할일 목록
	public ArrayList<Todo> findAll() {
		return list;
	}
	// 할일 삭제
	public int delete(Long tno) {
		for(Todo t:list) {
			if(t.getTno()==tno) {
				// 인덱스로 삭제 또는 객체로 삭제
				list.remove(t);
				return 1;
			}
		}
		return 0;
	}
	// 할일 변경

}
