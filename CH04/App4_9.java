public class App4_9
{
	public static void main (String args[])
	{
		int a =10, b =6;

		System.out.println("before compute ,a="+a+",b="+b);
		a-=b++;
		System.out.println("after compute ,a="+a+",b="+b);

	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_9.java

C:\j2sdk1.4.2_09\bin>java  App4_9
before compute ,a=10,b=6
after compute ,a=4,b=7

*/