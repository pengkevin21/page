public class App5_10
{
	public static void main (String args[])
	{
		int a=100,b=7;
		char oper='/';
		switch (oper)
		{
		    case '+':
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		    case '-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		    case '*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		    case '/':
			System.out.println(a+"/"+b+"="+((float)a/b));
			break;
		    case '%':
			System.out.println(a+"%"+b+"="+(a%b));
			break;
		    default:
		    	System.out.println("Unknown expression");
		    }			
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App5_10.java

C:\j2sdk1.4.2_09\bin>java  App5_10
100/7=14.285714

*/