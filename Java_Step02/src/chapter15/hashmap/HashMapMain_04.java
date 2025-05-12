package chapter15.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain_04 {

	public static void main(String[] args) {
		
		//#1. Hashtable ��ü ������ �̿��� ����ȭ �۾�
		Hashtable<String, Integer> inventory = new Hashtable<>();
		
		//#2. HashMap ��ü ������ �̿��� ����ȭ �۾�
		Map<String, Integer> unsafeMap = new HashMap<>();
		
		//��ǰ��� ��� ������ Ű�� ������ Hashtable�� �߰�
		inventory.put("Apple", 50);
		inventory.put("Banana", 30);
		inventory.put("Orange", 20);
		inventory.put("Mango", 10);
		
		//����ȭ Map���� ����
		Map<String, Integer> safeMap = Collections.synchronizedMap(unsafeMap);
		
		//����ȭ
		synchronized (safeMap) {
		for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue()+"��");
		   }
		}
		
		//��ǰ ��� ���
	    System.out.println("=== ��ǰ ��� ��� ===");
	    
	    for(Map.Entry<String, Integer> entry : inventory.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue()+"��");
		   }
	    
	    //Ư�� ��ǰ�� ��� Ȯ��
	    Scanner scan = new Scanner(System.in);
	    System.out.println("\n��� Ȯ���� ��ǰ���� �Է��ϼ���: ");
	    String product = scan.nextLine(); //key
	    
	    if(inventory.contains(product)) {
	    	System.out.println(product+"�� ���� "+inventory.get(product)+"�� �Դϴ�.");
	    }else {
	    	System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
	    }
	    
	    //��ǰ�� ��� ������Ʈ
	    System.out.println("\n��� ������Ʈ�� ��ǰ���� �Է��ϼ���: ");
	    String updateProduct = scan.nextLine();
	    
	    if(inventory.containsKey(updateProduct)) {
	    	System.out.println("�߰��� ������ �Է��ϼ���: ");
	    	int addQuantity = scan.nextInt(); //value
	    	inventory.put(updateProduct, inventory.get(updateProduct)+addQuantity);
	    	System.out.println(updateProduct+"�� ���� ���� "+inventory.get(updateProduct)+"�� �Դϴ�.");
	    }else {
	    	System.out.println("�ش� ��ǰ�� ��� �����ϴ�.");
	    }

	}

}
