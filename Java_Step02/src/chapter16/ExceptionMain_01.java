package chapter16;

public class ExceptionMain_01 {

	public static void main(String[] args) {
		
		String[] sarr = { "soldesk", "developer", "course" };
		
		for(int i=0; i<sarr.length; i++) {
			try {
				System.out.println(sarr[i]);
				
			} catch (Exception e) {
				System.out.println("���� �߻�");
				System.out.println(e.getMessage());
			}
		}//for
		
		

	}

}
