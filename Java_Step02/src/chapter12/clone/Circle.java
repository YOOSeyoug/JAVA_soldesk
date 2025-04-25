package chapter12.clone;

//Cloneable: ������ ������ Ŭ������ ����
//Cloneable ���� �� �ݵ�� clone()�޼��� �������̵�

public class Circle implements Cloneable{
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		//�����ڿ��� Point�� ��ü ����, �� Circle�� ��ü�� ��������� Point�� ��ü�� �ʼ��� ������
		point = new Point(x, y);
		this.radius = radius;
	}

	//Ŭ������ ��ü����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}


	@Override
	public String toString() {
		return "Circle [point=" + point + ", radius=" + radius + "]";
	}
	
	
	
	
	
	

}
