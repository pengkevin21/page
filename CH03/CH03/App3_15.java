import java.io.*;
public class App3_15
{
	public static void main (String args[]) throws IOException
	{
		int num1,num2;
		BufferedReader buf;
		String str1,str2;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J�Ĥ@�ӼƦr :");
		str1=buf.readLine();
		num1=Integer.parseInt(str1);

		System.out.println("�п�J�ĤG�ӼƦr :");
		str2=buf.readLine();
		num2=Integer.parseInt(str2);

		System.out.println(num1+"*"+num2+"�Ʀr1���Ʀr2�����n��"+(num1*num2));
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App3_15.java

C:\j2sdk1.4.2_09\bin>java  App3_15
�п�J�Ĥ@�ӼƦr :
150
�п�J�ĤG�ӼƦr :
311
150*311�Ʀr1���Ʀr2�����n��46650




*/