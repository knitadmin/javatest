
public class Encap {
	private int year, month ,day;
	
	Encap()
	{
		System.out.println("�� ����Ʈ ������ �Լ���..");
	}
	public Encap(int year,int month, int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		System.out.println("�� �����ִ� ������ �Լ���.. �ʱ�ȭ �۾��� �Ͻÿ�..");
	}
	public void printAll()
	{
		System.out.println(year +"��"+month+"��"+day+"��");
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
		System.out.println("ddd");
	
	}
}
