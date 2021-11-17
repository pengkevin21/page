public class App4_4
{
	public static void main (String args[])
	{
		int a =5;
		int b =3;
		System.out.println("a="+a+",b="+b);
		System.out.println("a%b="+(a%b));
		System.out.println("b%a="+(b%a));
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(b+"%"+a+"="+(b%a));

	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_4.java

C:\j2sdk1.4.2_09\bin>java  App4_4
a=5,b=3
a%b=2
b%a=3
5%3=2
3%5=3


*/