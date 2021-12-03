import java.io.*;
public class EX5_5a
{
	public static void main (String args[])throws IOException
	{
		int n,i,j;
		String str;
		BufferedReader buf;
		
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("½Ð¿é¤J¤W­­­È :");
		str=buf.readLine();
		n=Integer.parseInt(str);	

		for(i=n;i>1;i--)
		{
			for(j=1;j<i-1;j++)
			{
			System.out.print("*");
			}
			System.out.println(" ");
			
		}
	}
}
/* results
C:\mytest>javac EX5_5.java

C:\mytest>java EX5_5
********
*******
******
*****
****
***
**
*

*/