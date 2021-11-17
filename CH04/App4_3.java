public class App4_3
{
	public static void main (String args[])
	{
		int a =13;
		int b =4;
		System.out.println("a="+a+",b="+b);
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("a+b="+((float)a+b));
		System.out.println("a-b="+((float)a-b));
		System.out.println("a*b="+((float)a*b));
		System.out.println("a/b="+((float)a/b));
		System.out.println("a%b="+((float)a%b));
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_3.java

C:\j2sdk1.4.2_09\bin>java  App4_3
a=13,b=4
a+b=17
a-b=9
a*b=52
a/b=3
a%b=1
a+b=17.0
a-b=9.0
a*b=52.0
a/b=3.25
a%b=1.0


*/