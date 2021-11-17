public class App3_12
{
	public static void main (String args[])
	{
		int a = 155;
		int b = 9;
		float g,h;
		System.out.println("a="+a+" b="+b);
		g=a/b;
		System.out.println("a/b="+g+"\n");
		System.out.println("a="+a+" b="+b);
		h=(float)a/b;
		System.out.println("a/b="+h);

	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_12.java

C:\j2sdk1.4.2_09\bin>java  App3_12
a=155b=9
a/b=17.0

a=155b=9
a/b=17.222221


*/