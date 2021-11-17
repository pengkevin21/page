public class App3_2
{
	public static void main (String args[])
	{
		long num = 32998399887L;
		System.out.println("num = "+num );
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_2.java
App3_2.java:5: integer number too large: 32998399887
                long num = 32998399887;
                           ^
1 error
C:\j2sdk1.4.2_09\bin>javac App3_2.java

C:\j2sdk1.4.2_09\bin>java  App3_2
num = 32998399887

*/