import java.io.*;
public class EX5_9
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader buf1;
		String str1=" ";
		int num1;
		System.out.print("�п�J���Z: ");
		buf1= new BufferedReader(new InputStreamReader(System.in));
		str1=buf1.readLine();
		num1=Integer.parseInt(str1);

		
		switch (num1 / 10)
		{
			case 9 :
				System.out.println("�z�����Z�� : "+"�ҵ�");
				break;
			case 8 :
				System.out.println("�z�����Z�� : "+"�A��");
				break;
			case 7 :
				System.out.println("�z�����Z�� : "+"����");
				break;
			case 6 :
				System.out.println("�z�����Z�� : "+"�B��");
				break;
			default :
				System.out.println("�ɦҧa!!!");		
		}
			
	}
}