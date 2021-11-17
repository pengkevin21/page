public class App3_3
{
	public static void main (String args[])
	{
		long lmax = java.lang.Long.MAX_VALUE;
		int imax = java.lang.Integer.MAX_VALUE;
		short smax = java.lang.Short.MAX_VALUE;
		byte bmax = java.lang.Byte.MAX_VALUE;
		System.out.println("Max value of long : "+lmax );
		System.out.println("Max value of int : "+imax);
		System.out.println("Max value of short : "+smax );
		System.out.println("Max value of byte : "+bmax );
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_3.java

C:\j2sdk1.4.2_09\bin>java  App3_3
Max value of long : 9223372036854775807
Max value of int : 2147483647
Max value of short : 32767
Max value of byte : 127


*/