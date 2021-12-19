public class App6_6
{
	public static void main(String[] args)
	{
		star();
		System.out.println("I Love Java!");
		star();
	}	
	public static void star()
	{
		for(int i=0;i<12;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
/* results
C:\mytest>javac App6_6.java

C:\mytest>java App6_6
************
I Love Java!
************
*/