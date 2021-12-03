public class App5_7
{
	public static void main (String args[])
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
				continue;
			System.out.println("i="+i);
		}
		System.out.println("當迴圈中斷跳出時,i="+i);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_7.java

C:\j2sdk1.4.2_09\bin>java  App5_7
i=1
i=2
i=4
i=5
i=7
i=8
i=10
當迴圈中斷跳出時,i=11


*/