package chapter06;

import java.util.Scanner;

public class TakeTrans {

	public static void main(String[] args) {
		
		//학생 2명 생성
		
		StdInfo studentJames=new StdInfo("James", 20000);
		StdInfo studentTom=new StdInfo("Tom", 23000);
		
		//버스타기(100)
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//studentJames info
		studentJames.showinfo();
		bus100.showinfo();
		System.out.println("----------------------");
		
		Bus bus999=new Bus(999);
		studentTom.takeBus(bus999);
		//studentTom info
		studentTom.showinfo();
		bus100.showinfo();
		
		studentJames.takeBus(bus999);
		//studentJames info
		studentJames.showinfo();
		bus999.showinfo();
		System.out.println("---------------------------");
		
		//지하철 타기
		Subway subway1=new Subway(1);
		studentJames.takeSubway(subway1);
		//studentJames info
		studentJames.showinfo();
		subway1.showinfo();
		
		studentTom.takeSubway(subway1);
		studentTom.showinfo();
		subway1.showinfo();
		System.out.println("---------------------------");
		
		Subway subway3=new Subway(3);
		studentTom.takeSubway(subway3);
		studentTom.showinfo();
		subway3.showinfo();
		
		


	}

}
