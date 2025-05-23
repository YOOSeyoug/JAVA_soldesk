package chapter14.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserInfoMain_05 {

	public static void main(String[] args) {
		
		//UserInfo타입의 ArrayList -> arr
		ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
		
		outer: while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.print("아이디 생성(exit 입력 시 종료): ");
			String id = scan.next();
			
			UserInfo ui = new UserInfo();
			ui.setId(id);
			//-----------------------------------------
			//exit 입력 시
			if(ui.getId().equals("exit")) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}//if
			
			//아이디 중복 입력 시 메세지 출력 후 무시(continue outer) 후 다시 입력시도
			
			for(int i=0; i<arr.size(); i++) {
				if(ui.getId().equals(arr.get(i).getId())) {
					System.out.println("이미 있는 아이디입니다. 다른 아이디를 입력하세요!");
					continue outer;
				}
			}
            //-----------------------------------			
			System.out.print("패스워드 입력: ");
			ui.setPwd(scan.nextInt());
			
			arr.add(ui);
			
			for(int i=0; i<arr.size(); i++) {
				System.out.println(arr.get(i).getId());
				System.out.println(arr.get(i).getPwd());
				System.out.println();
			}
			System.out.println("----------------------");
			
		}//while
		
		
		

	}//main

}//class
