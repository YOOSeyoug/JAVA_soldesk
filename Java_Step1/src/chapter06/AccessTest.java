package chapter06;

public class AccessTest {

	//멤버 변수=필드
	private int aa; //접근지정자로 현재 클래스에서만 사용 가능
	public int bb; //접근지정자 공용(다른 클래스에서도 사용 가능)
	int cc; //생략되어 있으면 public
	
	//생성자 생략
	
    //메서드
	public void setAa(int aa) {
		this.aa = aa;
	}

	public void setBb(int bb) {
		this.bb = bb;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa값: "+aa+" bb값: "+bb+" cc값: "+cc);

	}

	public static void main(String[] args) {
		
		AccessTest number=new AccessTest();
		number.aa=10;
		System.out.println("aa="+number.aa);
		number.setAa(20);
		System.out.println("setAa(20)="+number.aa);
		
		number.setBb(30);
		System.out.println("setBb(30)="+number.bb);
		
		number.setCc(40);
		System.out.println("setCc(40)="+number.cc);
		
		number.Disp();

	}

}
