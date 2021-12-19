import java.io.*;
public class App6_8_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf1;
		String s1;
		int a;
		System.out.print("請輸入長: ");
		buf1=new BufferedReader(new InputStreamReader(System.in));
		s1=buf1.readLine();
		a=Integer.parseInt(s1);
		BufferedReader buf2;
		String s2;
		int b;
		System.out.print("請輸入寬: ");
		buf2=new BufferedReader(new InputStreamReader(System.in));
		s2=buf2.readLine();
		b=Integer.parseInt(s2);
		double num1,num2;
		num1=show_length1(a,b);
		
		System.out.println("length= "+num1);
		
	}	
	public static double show_length1(int m,int n)
	{
		
		return Math.sqrt(m*m+n*n);
	}
	
}
/* results
C:\mytest>javac App6_8_1.java

C:\mytest>java App6_8_1
請輸入長: 40
請輸入寬: 20
length= 44.721359549995796
*/