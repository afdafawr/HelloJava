package co.edu;

// 사람: 속성(이름, 나이, 키, 몸무게)
//		기능(달린다, 먹는다, 잠잔다)
public class Person {
	//속성 => 필드라고 부름.
	String name;
	int age;
	double height;
	double weight;
	// 기능 => 메소드.
	void run() { //리턴타입 함수명(매개변수)
		System.out.println(name + "이 달립니다.");
	}
	void eat(String food) {
		System.out.println(name + "이" + food+"을 먹습니다");
	}
	void sleep() {
		System.out.println(name + "이 잡니다");
	}
}
