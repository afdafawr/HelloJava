package co.edu.board;

import java.util.Scanner;

// 기능만.
public class BoardDAO {
	Scanner scn = new Scanner(System.in);

	//1.글등록
	public void addBoard() {
		System.out.println("글등록 기능입니다");
	}	
	//2.글목록
	public void boardList() {
		System.out.println("글목록 기능입니다");
	}
	//3.글상세보기
	public void boardDetail() {
		System.out.println("글상세보기 목록입니다");
	}
	//4.글삭제
	
	//5.전체메뉴
	public void exe() {
		boolean run = true;
		while(run) {
			System.out.println("1.글등록 2.글목록 3.글상세보기 4.글삭제 9.종료");
			System.out.println("선택 >> ");
			
			int menu = scn.nextInt();
			switch(menu) {
			case 1: addBoard(); 
					break;
			case 2: boardList();
					break;				
			case 3: boardDetail();
					break;
			case 4: 
				
			}
		}//end of while();
		System.out.println("프로그램 종료.");
	}// end of exe()
}
