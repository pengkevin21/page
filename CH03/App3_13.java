import java.io.*;
public class App3_13
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader buf;
		String str;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("請輸入字串 :");
		str=buf.readLine();

		System.out.println("您輸入的字串為 :"+str);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_13.java

C:\j2sdk1.4.2_09\bin>java  App3_13
請輸入字串 :
Java is a nice programming language
您輸入的字串為 :Java is a nice programming language


*/