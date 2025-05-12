package diary_project;

public class Diary {
	
	private int serialNum;
	private String title;
	private String content;
	private String date;
	
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Diary" + serialNum + " [" + title + "]\n" + content + "\n¿€º∫¿œ: " + date;
	}
	
	

}
