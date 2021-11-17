public class App4_7
{
	public static void main (String args[])
	{
		int a =58;
		
		if ((a<0)||(a>100))
			System.out.println("成績輸入錯誤");
		if ((a<60)&&(a>49))
			System.out.println("需要補考!");
	}
}

/* results
C:\j2sdk1.4.2_09\bin>javac App4_7.java

C:\j2sdk1.4.2_09\bin>java  App4_7
需要補考!


*/