package chapter08;

public class DmbCellPhone extends CellPhone {

	int channel;

	public DmbCellPhone(int channel, String model, String color) {
		this.channel = channel;
		this.model=model;
		this.color=color;
	}
	
	void turnOnDmb() {
		System.out.println("ä�� "+channel+"�� DMB ��� ������ �����մϴ�.");
		};
		
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä�� "+channel+"������ �ٲߴϴ�.");
	}
		
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
		};
	
	
	
	
}
