import java.io.*;
public class App3_13
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader buf;
		String str;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�п�J�r�� :");
		str=buf.readLine();

		System.out.println("�z��J���r�ꬰ :"+str);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_13.java

C:\j2sdk1.4.2_09\bin>java  App3_13
�п�J�r�� :
Java is a nice programming language
�z��J���r�ꬰ :Java is a nice programming language


*/