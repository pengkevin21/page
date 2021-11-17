public class App4_6
{
	public static void main (String args[])
	{
		int a =3;
		int b =3;
		System.out.println("a="+a);
		System.out.println(",a++="+(a++)+",a="+a);
		System.out.println("b="+b);
		System.out.println(",++b="+(++b)+",b="+b);

	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_6.java

C:\j2sdk1.4.2_09\bin>java  App4_6
a=3
,a++=3,a=4
b=3
,++b=4,b=4

*/