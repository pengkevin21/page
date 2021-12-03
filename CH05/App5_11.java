public class App5_11
{
	public static void main (String args[])
	{
		int sum=0;
		for(int i=1;i<=5;i++)
		{
			sum=sum+i;
			System.out.println("i="+i+", sum="+sum);
		}	
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_11.java

C:\j2sdk1.4.2_09\bin>java  App5_11
i=1, sum=1
i=2, sum=3
i=3, sum=6
i=4, sum=10
i=5, sum=15

*/