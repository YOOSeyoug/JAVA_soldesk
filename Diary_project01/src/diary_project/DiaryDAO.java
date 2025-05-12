package diary_project;

import java.util.ArrayList;

public class DiaryDAO {
	
	private static DiaryDAO diaryDAO = new DiaryDAO();
	private ArrayList<Diary> diaryList = new ArrayList<Diary>();
	private int serialNum = 0;
	
	private DiaryDAO() {
	}
	
	public static DiaryDAO getdiaryDAO() {
		return diaryDAO;
	}
	
	public void insertDiary(Diary diary) {
		diary.setSerialNum(serialNum++);
		diaryList.add(diary);
	}
	
	public ArrayList<Diary> checkDiary(int serialNum){
		ArrayList<Diary> result = new ArrayList<Diary>();
		for(Diary d : diaryList) {
			if(d.getSerialNum() == serialNum) {
				result.add(d);
			}
		}
		return result;
	}
	
	public void updateDiary(int serialNum, String title, String content) {
		for(Diary d : diaryList) {
			if(d.getSerialNum() == serialNum) {
				d.setTitle(title);
				d.setContent(content);
			}
		}
	}
	
	public void deleteDiary(int serialNum) {
		diaryList.removeIf(d -> d.getSerialNum() == serialNum);
	}

}
