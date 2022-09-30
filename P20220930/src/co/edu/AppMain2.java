package co.edu;

public class AppMain2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.setStudNo("1-111");
		s1.setStudName("홍길동");
		s1.setMajor("컴퓨터공학과");
		s1.setAge(20);
		
		System.out.println(s1.getStudNo());
		System.out.println(s1.getAge());
		System.out.println(s1.showInfo());
		
		Student s2 = new Student();
		s2.setStudName("김민숙");
		s2.setStudNo("1-112");
		s2.setMajor("기공");
		System.out.println(s2.showInfo());
		
		String[] hob = {"독서", "자전거"};
		s1.setHobbies(hob);
		s1.addHobby("음악듣기");
		System.out.println(s1.getHobb());
		
		Student s3 = new Student();
		System.out.println(s3.getStudName());
		
		Student s4 = new Student("111-234", "김동욱");
		System.out.println(s4.showInfo());
	}
}
