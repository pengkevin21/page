public class App3_9
{
	public static void main (String args[])
	{
		float fmax = java.lang.Float.MAX_VALUE;
		float fmin = java.lang.Float.MIN_VALUE;
		double dmax = java.lang.Double.MAX_VALUE;
		double dmin = java.lang.Double.MIN_VALUE;
		System.out.println("Max value of float : "+fmax );
		System.out.println("Min value of float : "+fmin );
		System.out.println("Max value of double : "+dmax );
		System.out.println("Min value of double : "+dmin );
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_9.java

C:\j2sdk1.4.2_09\bin>java  App3_9
Max value of float : 3.4028235E38
Min value of float : 1.4E-45
Max value of double : 1.7976931348623157E308
Min value of double : 4.9E-324



*/