import java.io.*;
public class App3_14
{
	public static void main (String args[]) throws IOException
	{
		int num;
		BufferedReader buf;
		String str;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J�Ʀr :");
		str=buf.readLine();
		num=Integer.parseInt(str);
		System.out.println("�z��J���Ʀr�� :"+str);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_14.java

C:\j2sdk1.4.2_09\bin>java  App3_14
�п�J�Ʀr :
5566
�z��J���Ʀr�� :5566



*/