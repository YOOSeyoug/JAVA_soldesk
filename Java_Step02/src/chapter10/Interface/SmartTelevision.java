package chapter10.Interface;

public class SmartTelevision implements Remote, Searchable {

	//�������
	private int volume;

	@Override
	public void seatch(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > Remote.MAX_VOLUME) { //������ 10���� Ŭ ���
			this.volume = Remote.MAX_VOLUME;
		}else if(volume < Remote.MIN_VOLUME) { //������ 0���� �������
			this.volume = Remote.MIN_VOLUME;
		}else {
			this.volume = volume;			
		}//if
		
		System.out.println("���� TV ����: "+this.volume);
	}
	
	
	
}
