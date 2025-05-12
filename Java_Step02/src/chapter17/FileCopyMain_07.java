package chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain_07 {

	public static void main(String[] args) {
		
		// 원본 및 복사 파일 경로 설정
		String sourceFile = "IOStream.txt";
		String destFile = "copy.txt";
		
		//BufferedInputStream으로 읽어들여서 BufferedOutputStream으로 복사해서 저장
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile)); //가져오기
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile))) { //복사
			
			byte[] buffer = new byte[1024]; //1KB 버퍼
			int bytesRead;
			
			//원본 파일에서 데이터를 읽어 복사 파일에 저장
			while((bytesRead=bis.read(buffer)) != -1) {
				//1024KB씩 0부터 시작해서 내용 복사 파일에 저장
				bos.write(buffer, 0, bytesRead);
			}//while
			System.out.println("파일이 성공적으로 저장 되었습니다.");
		} catch (Exception e) {
			System.out.println("파일 복사 도중 오류 발생: "+e.getMessage());
		}
		

	}

}
