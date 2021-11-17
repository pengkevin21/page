public class App3_3_1
{
	public static void main (String args[])
	{
		long lmin = java.lang.Long.MIN_VALUE;
		int imin = java.lang.Integer.MIN_VALUE;
		short smin = java.lang.Short.MIN_VALUE;
		byte bmin = java.lang.Byte.MIN_VALUE;
		System.out.println("Min value of long : "+lmin );
		System.out.println("Min value of int : "+imin );
		System.out.println("Min value of short : "+smin );
		System.out.println("Min value of byte : "+bmin );
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_4.java

C:\j2sdk1.4.2_09\bin>java  App3_4
Min value of long : -9223372036854775808
Min value of int : -2147483648
Min value of short : -32768
Min value of byte : -128


*/