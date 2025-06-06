package chapter18.lambda;

public class MuNumberMain_02 {

	public static void main(String[] args) {
		
		//Lambda식 활용
		MyNumber max = (x,y) -> (x>=y) ? x : y;
		System.out.println(max.getMax(10, 20));
		
		//일반적인 활용
		MyNumber aa = new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max = (x>=y) ? x : y;
				return max;
			}
		};
		
		System.out.println(aa.getMax(10, 20));

	}

}
