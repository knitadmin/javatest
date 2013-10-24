//constructor, this

public class ConstTest {
	int su;
	String name;
	//วüลย
	public ConstTest()
	{
		//default
		this(23,"kim moo");
		System.out.println("constructor-1");
		
	}
	ConstTest(int su, String name)
	{
		this.su = su;
		this.name = name;
		System.out.println("constructor-2");
	}
	void print()
	{
		System.out.println("print calling name : "+ name);
		add(3, 4);
	}
	void add(int i, int j)
	{
		this.su = i+j;
		System.out.println("su : "+ su);
	}
	public static void main(String[] args)
	{
		ConstTest c = new ConstTest(); //System
		c.print();
		c.name = "kim..soo";
		System.out.println("name : "+ c.name);
	}
}
