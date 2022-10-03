package co.edu.tel;

import java.util.Scanner;

public class TelDAO {
	Scanner scn = new Scanner(System.in);
	Tel[] mytel = new Tel[100];
	//1 전화번호등록
	public void addTel() {
		System.out.println("전화번호 등록 메뉴 입니다");
		System.out.println("전화번호 입력해주세요 >>");
		int telno= scn.nextInt();scn.nextLine();
		System.out.println("이름을 입력해 주세요");
		String name = scn.nextLine();
		System.out.println("친구의 생일을 입력해주세요 >>");
		String bdyno= scn.nextLine();
		
		
		for(int i=0; i<mytel.length; i++) {
			Tel teladd = new Tel(i+1,telno, name, bdyno);
			if(mytel[i]==null)
			{
				mytel[i]=teladd;
				break;
			}
		}
	}
	//2 전화번호목록
	public void listTel() {
		System.out.println("저장된 전화번호 목록");
		System.out.println("===============");
		for(Tel tell : mytel)
			if(tell != null) {
				System.out.println(tell.toString());
		}
	}
	//3 전화번호삭제
	public void delTel() {
		System.out.println("전화번호 삭제 메뉴 입니다");	
		System.out.println("삭제할 대표번호를 적어주세요 >> ");
		int bno = scn.nextInt();
		for(int i=0; i<mytel.length; i++) {
			if(mytel[i]!=null && bno == mytel[i].getMainnumber()) {
				mytel[i] = null;
			}
		}
	}
	//4 상세보기
	public void showTel() {
		System.out.println("전화번호 상세보기 메뉴 입니다");
		System.out.println("대표번호를 입력해 주세요");
		int bNo = scn.nextInt();
		for(int i=0; i<mytel.length; i++) {
			if(mytel[i]!=null && bNo==mytel[i].getMainnumber()){
				System.out.println(mytel[i].toString());
			}
		}
		
		
	}
	
	//전체 메뉴
	public void telExe() {
		
		
		boolean cycle = true;
		
		while(cycle) {
			System.out.println("1.전화번호 등록 2.전화번호 목록 3.삭제 4.상세보기 5.종료" );
			System.out.println("메뉴를 입력하시오 >> ");
			int mNo = scn.nextInt();
		switch(mNo){
		case 1:
			addTel();
			break;
		case 2:
			listTel();
			break;
		case 3:
			delTel();
			break;
		case 4:
			showTel();
			break;
		case 5:
			cycle=false;	
			break;
		default : System.out.println("잘못된 번호입니다");
		}
		}	
		System.out.println("종료되었습니다");
	}
}
