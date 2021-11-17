import java.io.*;
public class App3_14
{
	public static void main (String args[]) throws IOException
	{
		int num;
		BufferedReader buf;
		String str;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入數字 :");
		str=buf.readLine();
		num=Integer.parseInt(str);
		System.out.println("您輸入的數字為 :"+str);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_14.java

C:\j2sdk1.4.2_09\bin>java  App3_14
請輸入數字 :
5566
您輸入的數字為 :5566



*/