package chapter17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadFromFileMain_02 {

	public static void main(String[] args) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
			String line;
			System.out.println("���� ����");
			while((line=reader.readLine()) != null) {
				System.out.println(line);
			}//while
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
