import java.io.*;
public class App5_4
{
	public static void main (String args[]) throws IOException
	{
		int n,i=1,sum=0;
		String str;
		BufferedReader buf;
		
		buf=new BufferedReader(new InputStreamReader(System.in));
		do{
		System.out.print("請輸入上限值 :");
		str=buf.readLine();
		n=Integer.parseInt(str);	
		}while(n<=0);
		do	
			sum+=i++;
		while(i<=n);
		System.out.println("1+2+.....+"+n+"="+sum);
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_4.java

C:\j2sdk1.4.2_09\bin>java  App5_4
請輸入上限值 :1980
1+2+.....+1980=1961190


*/