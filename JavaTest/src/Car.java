/*
 	Ŭ������ �������: �Ӽ�(����), ����(�޼ҵ�), ������ �Լ�.
 	�Ӽ�: name, company, color, date
 	����: �������� 1-������, 0-������.
 */
public class Car {
	String name, company, color, date;
	
	public Car(){
		System.out.println("�� ������ �Լ���..");
	}
	public void driveSate(int i)
	{
		if(i ==0)
			System.out.println("������");
		else if(i==1)
			System.out.println("������");		
	}
	public static void main(String[] arg)
	{
		Car c = new Car();
		c.driveSate(1);
		System.out.println("dd");
		
	}
}
