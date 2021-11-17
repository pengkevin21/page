import java.io.*;
public class App3_13
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader buf;
		String str1,str2;
		int num1,num2;
		
		buf =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("叫块计1 :");
		str1=buf.readLine();
		num1=Integer.parseInt(str1);
		
		System.out.print("叫块计2 :");
		str2=buf.readLine();
		num2=Integer.parseInt(str2);
		
		System.out.println("眤块计1 :"+str1);
		System.out.println("眤块计2 :"+str2);
		System.out.println("眤块计1∠计2 :"+(str1+str2));
		System.out.println("眤块计1∠计2 :"+(num1+num2));
	}
}

/* results
D:\CH03>javac App3_13.java

D:\CH03>java App3_13
叫块计1 :58
叫块计2 :12
眤块计1 :58
眤块计2 :12
眤块计1∠计2 :5812
眤块计1∠计2 :70
*/