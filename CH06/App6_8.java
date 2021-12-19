public class App6_8
{
	public static void main(String[] args)
	{
		double num1,num2;
		num1=show_length1(6,7);
		num2=show_length2(8,3);
		System.out.println("length= "+num1);
		System.out.println("area= "+num2);
	}	
	public static double show_length1(int m,int n)
	{
		
		return Math.sqrt(m*m+n*n);
	}
	public static double show_length2(int p,int q)
	{
		
		return (p*q);
	}
}
/* results
C:\mytest>javac App6_8.java

C:\mytest>java App6_8
length= 9.219544457292887
area= 24.0
*/