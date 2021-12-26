class CCircle
{
	CCircle()
	{
		System.out.println("the 1st Constructor");		
	}
	
	CCircle(int a)
	{
		this();
		System.out.println("the 2nd Constructor");		
	}
	
	CCircle(double d)
	{
		this(5);
		System.out.println("the 3rd Constructor");		
	}
	
	CCircle(int a,double d)
	{
		this(8.5);
		System.out.println("the 4th Constructor");
	}

}

public class ConThis
{
	public static void main(String args[])
	{
		CCircle cir1=new CCircle(3,3.6);
	}
}