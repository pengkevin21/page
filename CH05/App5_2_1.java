import java.io.*;
public class App5_2_1
{
	public static void main (String args[]) throws IOException
	{
		int i,sum=0,start,end;
		String str1,str2;
		BufferedReader buf;
		
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�U����:");
		str1=buf.readLine();
		start=Integer.parseInt(str1);
		
		System.out.print("�п�J�W����:");
		str2=buf.readLine();
		end=Integer.parseInt(str2);
		
		for(i=start;i<=end;i++)
			sum=sum+i;
		System.out.println(start+"+.....+"+end+"="+sum);
		
	}
}


