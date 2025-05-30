package Test02_Java2.chapter14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonInfo {
	
	int menu;
	Person per;
	
	ArrayList<Person> persons = new ArrayList<Person>();
	
	public void personInfo() {
		
		while(true) {
			System.out.println("(1)회원가입, (2)정보삭제, (3)정보검색, (4)종료");
			
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: {
				per = new Person();
				System.out.println("회원가입을 선택하셨습니다.");
				System.out.println("---정보를 입력하세요.---");
				
				System.out.print("이름: ");
				per.setName(scan.next());
				
				System.out.print("나이: ");
				per.setAge(scan.nextInt());
				
				System.out.print("번호: ");
				per.setTel(scan.next());
				
				persons.add(per);
				System.out.println("회원가입이 완료되었습니다.");
				break;
				
			}
			
			case 2: {
				System.out.println("정보 삭제를 선택하셨습니다.");
				System.out.println("정보를 삭제할 회원 명을 입력해주세요.");
				String name = scan.next();
				
				for(int i=0; i<persons.size(); i++) {
					if(persons.get(i).getName().equals(name)) {
						persons.remove(i);
						System.out.println("회원 정보가 삭제되었습니다.");
					}else {
						System.out.println("존재하지 않는 회원명입니다.");
					}
				}
				break;
			}
			
			case 3: {
				System.out.println("정보 검색을 선택하셨습니다.");
				System.out.println("현재 등록된 회원 수는 "+persons.size()+"명 입니다.");
				Iterator<Person> it = persons.iterator();
				
				while(it.hasNext()) {
					per = it.next();
					System.out.println("이름: "+per.getName());
					System.out.println("나이: "+per.getAge());
					System.out.println("번호: "+per.getTel());
					System.out.println("----------------------");
				}
				break;
			}
			
			case 4: {
				System.out.println("프로그램 종료를 선택하셨습니다.");
				System.out.println("프로그램을 종료합니다.");
				return;
			}
			
			default:
				System.out.println("잘못된 메뉴 번호입니다. 다시 선택해주세요.");
				break;
			}
	}
	
		
		
	}
	

}
