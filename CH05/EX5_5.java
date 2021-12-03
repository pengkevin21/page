public class EX5_5
{
	public static void main (String args[])
	{
		int i,j;
		for(i=10;i>1;i--)
		{
			for(j=1;j<i-1;j++)
			{
			System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
/* results
C:\mytest>javac EX5_5.java

C:\mytest>java EX5_5
********
*******
******
*****
****
***
**
*

*/