import java.io.*;
public class App4_7a
{
	public static void main (String args[])throws IOException
	{
		BufferedReader buf1;
		String str1;
		int a ;
		buf1 =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J���Z :");
		str1=buf1.readLine();
		a =Integer.parseInt(str1);
		if ((a<0)||(a>100))
			System.out.println("���Z��J���~");
		if ((a>=60) && (a<90))
			System.out.println("���ߧA�����Z�� "+a+" ��");
		if ((a<60)&&(a>49))
			System.out.println("�ݭn�ɦ�!");
		if (a<50)
		System.out.println("�A����F!!!!!");
	}
}
