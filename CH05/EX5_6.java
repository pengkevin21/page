public class EX5_6
{
	public static void main (String args[])
	{
		int i,j;
		for(i=10;i>=1;i--)
		{
			for(j=1;j<=10;j++)
			{
				if (j<i) 
				System.out.print(" ");
				else
				System.out.print(j);
			
			}
			System.out.println("  " + "i =" + i);
			
		}
	}
}
/* results
C:\mytest>javac EX5_6.java

C:\mytest>java EX5_6
                 10  i =10
               910  i =9
             8910  i =8
           78910  i =7
         678910  i =6
       5678910  i =5
     45678910  i =4
   345678910  i =3
 2345678910  i =2
12345678910  i =1
*/