package chapter09;

public abstract class GameCharacter {

	//���ø� �޼��� : �������� ���� ����
	
	public final void fight() {
		enterBattlefield(); //�������� ����
		atack(); //���� -> ���� Ŭ������ ����, �������̵� �ݵ�� �ʿ�
		useUItimate(); //������ ��� -> ���� Ŭ���� ���� �ʿ�
		leaveBattlefield(); //�������� ����
	}
	
	//���� �޼���
	private void enterBattlefield() {
		System.out.println("[����] ��ȯ���� ��� ���� �� ȯ���մϴ�.");
	}
	
	private void leaveBattlefield() {
		System.out.println("[����] ��ȯ�簡 ������ �������ϴ�.");
	}
	
	//���� Ŭ������ �ݵ�� �����ؾ� �ϴ� �߻�޼���
	protected abstract void atack();
	protected abstract void useUItimate();


}
