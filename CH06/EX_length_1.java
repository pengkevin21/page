import java.io.*;
public class EX_length_1
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
		
		
		show_length1(a,b);		
		area(a,b);					
	}	
	
	public static void show_length1(int m,int n)
	{		
		System.out.println( Math.sqrt(m*m+n*n));
	}
	
	public static void area(int p, int q)
	{
		System.out.println( (p*q));
	}
	
}
/* results
C:\Java1>javac EX_length_1.java

C:\Java1>java EX_length_1
�п�J��: 11
�п�J�e: 13
17.029386365926403
143
*/