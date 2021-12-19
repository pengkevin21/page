import java.io.*;
public class EX_length
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("請輸入長: ");
		String s1=buf.readLine();
		int a=Integer.parseInt(s1);
			
		System.out.print("請輸入寬: ");
		String s2=buf.readLine();
		int b=Integer.parseInt(s2);
		
		double num1,num2;
		num1=show_length1(a,b);		
		num2=area(a,b);
		
		System.out.println("對角線長度為 "+num1);
		System.out.println("面積為 "+num2);
	}	
	
	public static double show_length1(int m,int n)
	{		
		return Math.sqrt(m*m+n*n);
	}
	
	public static double area(int p, int q)
	{
		return (p*q);
	}
	
}
/* results
C:\Java1>javac EX_length.java

C:\Java1>java EX_length
請輸入長: 7
請輸入寬: 11
對角線長度為 13.038404810405298
面積為 77.0
*/