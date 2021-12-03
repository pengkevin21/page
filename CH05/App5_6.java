public class App5_6
{
	public static void main (String args[])
	{
		int i;
		for(i=1;i<=10;i++)
		{
			if(i%3==0)
				break;
			System.out.println("i="+i);
		}
		System.out.println("當迴圈中斷跳出時,i="+i);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_6.java

C:\j2sdk1.4.2_09\bin>java  App5_6
i=1
i=2
當迴圈中斷跳出時,i=3



*/