public class App5_3
{
	public static void main (String args[])
	{
		int i=1,sum=0;
		while(i<=1000)
		{
			sum=sum+i;
			i=i+1;
		}	
		System.out.println("1+2+.....+1000="+sum);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_2.java

C:\j2sdk1.4.2_09\bin>java  App5_2
1+2+.....+1000=500500

*/