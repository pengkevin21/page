import java.io.*;
public class EX5_9
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader buf1;
		String str1=" ";
		int num1;
		System.out.print("叫块Θ罿: ");
		buf1= new BufferedReader(new InputStreamReader(System.in));
		str1=buf1.readLine();
		num1=Integer.parseInt(str1);

		
		switch (num1 / 10)
		{
			case 9 :
				System.out.println("眤Θ罿 : "+"ヒ单");
				break;
			case 8 :
				System.out.println("眤Θ罿 : "+"单");
				break;
			case 7 :
				System.out.println("眤Θ罿 : "+"单");
				break;
			case 6 :
				System.out.println("眤Θ罿 : "+"单");
				break;
			default :
				System.out.println("干σ!!!");		
		}
			
	}
}