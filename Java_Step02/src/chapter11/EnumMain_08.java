package chapter11;

import java.util.Scanner;

public class EnumMain_08 {

	public enum Item{ //final
		start, Pause, Exit
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
			
			int n = scan.nextInt();
			
			Item start = Item.start; //변수방 이름 start, 여기에 0을 정의
			Item pause = Item.Pause; //변수방 이름 pause, 여기에 1을 정의
			Item exit = Item.Exit; //변수방 이름 Exit, 여기에 2를 정의
			
			if(n==start.ordinal()) {
				System.out.println("게임이 시작함");
			}else if(n==pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			}else if(n==exit.ordinal()) {
				System.out.println("게임이 종료됨");
			}else {
				System.out.println("서비스 지원이 없는 번호입니다.");
				return;
			}
			
			
		}//while
		

	}//main

}//class
