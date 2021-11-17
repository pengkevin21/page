public class App3_6
{
	public static void main (String args[])
	{
		char ch1 = 97;
		char ch2 = 'a';
		char ch3 = '\u0061';
		char ch4 ='\\';     //¾켹ㅟ그퐑
		char ch5 ='\"';     //¾켹찬ㅮ많
		System.out.println("ch1 = "+ch1 );
		System.out.println("ch2 ="+ch2 );
		System.out.println("ch3 ="+ch3 );
		System.out.println("ch4 ="+ch4 );
		System.out.println("ch5 ="+ch5 );
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_6.java

C:\j2sdk1.4.2_09\bin>java  App3_6
ch1 = a
ch2 =a
ch3 =a
ch4 =\
ch5 ="

*/