
public class Encap {
	private int year, month ,day;
	
	Encap()
	{
		System.out.println("난 디폴트 생성자 함수야..");
	}
	public Encap(int year,int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("난 인자있는 생성자 함수야.. 초기화 작업을 하시요..");
	}
	public void printAll()
	{
		System.out.println(year +"년"+month+"월"+day+"일");
	}
	public int getYear()
	{
		return this.year;
	}
	public int getMonth()
	{
		return this.month;
	}
	public int getDay()
	{
		return this.day;
	}
	/*public void setYear(int year)
	{
		this.year = year;
	}*/
	public void setMonth(int month)
	{
		this.month = month;
	}
	public void setDay(int day)
	{
		this.day = day;
	}
	public void teee(){
		System.out.println("dddd");
	}
	public void teee3333(){
		System.out.println("dddd");
	}
}
class EncapTest
{
	public static void main(String[] arg)
	{
		Encap en = new Encap(2001,10,10);
		System.out.println("day: "+en.getDay());
		en.setDay(28); // en.day = 28;
		System.out.println("day: "+en.getDay());
		en.printAll();
System.out.println("Ddd");
	}
}
