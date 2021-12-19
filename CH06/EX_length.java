import java.io.*;
public class EX_length
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�п�J��: ");
		String s1=buf.readLine();
		int a=Integer.parseInt(s1);
			
		System.out.print("�п�J�e: ");
		String s2=buf.readLine();
		int b=Integer.parseInt(s2);
		
		double num1,num2;
		num1=show_length1(a,b);		
		num2=area(a,b);
		
		System.out.println("�﨤�u���׬� "+num1);
		System.out.println("���n�� "+num2);
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
�п�J��: 7
�п�J�e: 11
�﨤�u���׬� 13.038404810405298
���n�� 77.0
*/