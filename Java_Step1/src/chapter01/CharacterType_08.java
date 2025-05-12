package chapter01;

public class CharacterType_08 {

	public static void main(String[] args) {
		// Character(臾몄옄) Type
		// Java, C# -> 2byte(16bit) -> UTF-16
		// C, C++ -> 1byte(8bit) -> UTF-8
		
		//char ch1='�; // 吏곸젒 �븳湲� �엯�젰
	    char ch2='\uD55C'; //�쑀�땲肄붾뱶 �몴�쁽�븳 '�븳'
	    
	    //System.out.println("ch1: " + ch1);
	    //System.out.println("ch2: " + ch2);
	    
	    char str1='A'; //�떒�씪 臾몄옄
	    System.out.println("str1: "+ str1);
	    
	    String str2="Hello Java";
	    System.out.println("str2: "+ str2);
	    
	    String str3="W"; //1湲��옄留� String 
	    System.out.println("str3: "+str3);
	    

	}

}
