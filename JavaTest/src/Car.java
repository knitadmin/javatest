/*
 	클래스의 구성요소: 속성(변수), 동작(메소드), 생성자 함수.
 	속성: name, company, color, date
 	독작: 운전상태 1-운전중, 0-정지중.
 */
public class Car {
	String name, company, color, date;
	
	public Car(){
		System.out.println("난 생성자 함수야..");
	}
	public void driveSate(int i)
	{
		if(i ==0)
			System.out.println("정지중");
		else if(i==1)
			System.out.println("운전중");		
	}
	public static void main(String[] arg)
	{
		Car c = new Car();
		c.driveSate(1);
		System.out.println("dd");
		
	}
}
