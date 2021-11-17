import java.io.*;
public class App4_7a
{
	public static void main (String args[])throws IOException
	{
		BufferedReader buf1;
		String str1;
		int a ;
		buf1 =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入成績 :");
		str1=buf1.readLine();
		a =Integer.parseInt(str1);
		if ((a<0)||(a>100))
			System.out.println("成績輸入錯誤");
		if ((a>=60) && (a<90))
			System.out.println("恭喜你的成績為 "+a+" 分");
		if ((a<60)&&(a>49))
			System.out.println("需要補考!");
		if (a<50)
		System.out.println("你死當了!!!!!");
	}
}
