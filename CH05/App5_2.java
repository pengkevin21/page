public class App5_2
{
	public static void main (String args[])
	{
		int i,sum=0;
		for(i=1;i<=1000;i++)
			sum=sum+i;
		System.out.println("1+2+.....+1000="+sum);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_2.java

C:\j2sdk1.4.2_09\bin>java  App5_2
1+2+.....+1000=500500

*/