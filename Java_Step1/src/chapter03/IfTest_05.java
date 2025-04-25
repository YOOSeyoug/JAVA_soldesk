package chapter03;

import javax.swing.JOptionPane;

public class IfTest_05 {

	public static void main(String[] args) {
		/* BMI = 체중(kg) / 신장(cm)*2
		   25이상: 과체중
		   18.5 이상 25미만: 정상
		   18.5 미만: 저체중
		 */
		
		double weight=Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg)를 입력하세요"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("키(cm)를 입력하세요"))/100.0;
				
		double bmi=weight/(height*2);
		String result;
		
		if(bmi >= 25) {
			result="과체중";
		}else if(bmi >= 18.5) {
			result="정상";
		}else {
			result="저체중";
		}
		
		System.out.printf("당신의 BMI는 %.2f 이며, %s 입니다." , bmi, result);

	}

}
