import java.io.*;
public class App3_16
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader buf1;
		String str1;
		BufferedReader buf2;
		String str2;
		int num1,num2,num3,num4 ;
		buf1 =new BufferedReader(new InputStreamReader(System.in));
		buf2 =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J�r�� :");
		str1=buf1.readLine();
		num1=Integer.parseInt(str1);
		System.out.println("�п�J�r�� :");
		str2=buf2.readLine();
		num2=Integer.parseInt(str2);
		//str3=str1+str2;
		num3=num1+num2;
		num4=num1*num2;
		System.out.println("�z��J���ƭȬ� :"+str1);
		System.out.println("�z��J���ƭȬ� :"+str2);
		System.out.println("total :"+num3);
		System.out.println("total :"+num4);
		
	}
}

/* results
C:\mytest>javac App3_16.java

C:\mytest>java App3_16
�п�J�r�� :
500
�п�J�r�� :
30
�z��J���ƭȬ� :500
�z��J���ƭȬ� :30
total :530
total :15000

*/