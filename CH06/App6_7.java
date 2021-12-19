public class App6_7
{
	public static void main(String[] args)
	{
		int num;
		num=star(7);
		System.out.println(num+" stars printed");
	}	
	public static int star(int n)
	{
		for(int i=0;i<2*n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		return 2*n;
	}
}
/* results
C:\mytest>javac App6_7.java

C:\mytest>java App6_7
**************
14 stars printed
*/