package chapter07;

import java.util.Scanner;

import chapter08.A;

public class Tour {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("관광객 수: ");
		int n = scan.nextInt(); //3
		
		//초기화를 통해서 메모리 확보 및 고객생성(Guide의 객체)
		//guide.guest[0], guide.guest[1], guide.guest[2],
		Guide_04 guide = new Guide_04(n);
		
		System.out.println();
		System.out.println("관광객 등록");
		
		//관광객 등록
		for(int i=0; i<n; i++) {
			System.out.print((i+1)+". 이름: ");
			String name=scan.next();
			guide.guest[i].setName(name);
			
			System.out.print((i+1)+". 성별: ");
			String gender=scan.next();
			guide.guest[i].setGender(gender);
		}//for
		
		boolean run = true;
		while(run) {
			System.out.println();
			System.out.println("1. 관광객 정보\n2. 목적지 변경\n3. 종료");
			System.out.println("메뉴 번호를 선택해주세요: ");
			int menu=scan.nextInt();
			
			switch (menu) {
			case 1: {
				System.out.println("1. 관광객 정보를 선택하셨습니다.");
//				System.out.println("1.이름: "+guide.guest[i].getName());
				for(int i = 0; i < guide.guest.length; i++) {
					System.out.println("이름 : " + guide.guest[i].getName());
					System.out.println("성별 : " + guide.guest[i].getGender());
					System.out.println("목적지 : "+ Guide_04.point);
					System.out.println();
				}
				break;
			}
			case 2: {
				System.out.println("2. 목적지 변경을 선택하셨습니다.");
				System.out.println("목적지를 어디로 변경하시겠습니까? : ");
				scan.nextLine();
				Guide_04.point=scan.nextLine();
				System.out.println("목적지를 "+Guide_04.point+"로 변경하였습니다.");
				break;
			}
			case 3: {
				System.out.println("프로그램을 종료합니다.");
				run=false;
				break;
			}
			default: 
				System.out.println("잘못된 메뉴 번호입니다.");
				break;
			
			}//switch
		}
		
		//while
		

	}

}
