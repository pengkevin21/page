import java.io.*;
public class App3_15
{
	public static void main (String args[]) throws IOException
	{
		int num1,num2;
		BufferedReader buf;
		String str1,str2;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入第一個數字 :");
		str1=buf.readLine();
		num1=Integer.parseInt(str1);

		System.out.println("請輸入第二個數字 :");
		str2=buf.readLine();
		num2=Integer.parseInt(str2);

		System.out.println(num1+"*"+num2+"數字1乘數字2的乘積為"+(num1*num2));
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_15.java

C:\j2sdk1.4.2_09\bin>java  App3_15
請輸入第一個數字 :
150
請輸入第二個數字 :
311
150*311數字1乘數字2的乘積為46650




*/