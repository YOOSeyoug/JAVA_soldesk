package chapter12.string;

class Book{
	
	String title;
	String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title+ ", "+author;
	}
	
	
	
}//Book

public class ToStringMain_07 {

	public static void main(String[] args) {
		
		Book book = new Book("JAVA", "솔데스크");
		System.out.println(book);
		//멤버변수를 직접 호출하며 확인
		System.out.println(book.title);
		System.out.println(book.author);
		System.out.println();
		System.out.println(book.toString());
	}

}
