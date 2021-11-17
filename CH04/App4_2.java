public class App4_2
{
	public static void main (String args[])
	{
		byte a = java.lang.Byte.MAX_VALUE;
		boolean b = false;
		System.out.println("a="+a+",a干计~a="+(~a));
		System.out.println("b="+b+",NOT b !b="+(!b));
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_2.java

C:\j2sdk1.4.2_09\bin>java  App4_2
a=127,a干计~a=-128
b=false,NOT b !b=true



*/