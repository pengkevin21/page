import java.io.*;
public class App3_13
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader buf;
		String str1,str2;
		int num1,num2;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�п�J�Ʀr1 :");
		str1=buf.readLine();
		num1=Integer.parseInt(str1);
		
		System.out.print("�п�J�Ʀr2 :");
		str2=buf.readLine();
		num2=Integer.parseInt(str2);
		
		System.out.println("�z��J���Ʀr1�� :"+str1);
		System.out.println("�z��J���Ʀr2�� :"+str2);
		System.out.println("�z��J���Ʀr1�ϼƦr2�� :"+(str1+str2));
		System.out.println("�z��J���Ʀr1�ϼƦr2�� :"+(num1+num2));
	}
}

/* results
D:\CH03>javac App3_13.java

D:\CH03>java App3_13
�п�J�Ʀr1 :58
�п�J�Ʀr2 :12
�z��J���Ʀr1�� :58
�z��J���Ʀr2�� :12
�z��J���Ʀr1�ϼƦr2�� :5812
�z��J���Ʀr1�ϼƦr2�� :70
*/