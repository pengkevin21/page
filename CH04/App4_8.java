public class App4_8
{
	public static void main (String args[])
	{
		int a =5, b =8;

		System.out.println("before compute ,a="+a+",b="+b);
		a+=b;
		System.out.println("after compute ,a="+a+",b="+b);

	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_8.java

C:\j2sdk1.4.2_09\bin>java  App4_8
before compute ,a=5,b=8
after compute ,a=13,b=8

*/