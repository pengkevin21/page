public class EX5_4
{
	public static void main (String args[])
	{
		int i,count,sum;
		count=0;
		sum=0;
		for(i=7;i<=100;i++)
		{
			if ( i % 7 == 0 )
			{	
				sum=sum+i;
				count=count+1;
				System.out.print(i+"   ");
			}
		}
		System.out.println();
		System.out.println("7���ƪ��ӼơG" + count);	
		System.out.println("7���Ƥ��`�M�G" + sum);		
	}
}
/* results
C:\mytest>javac EX5_4.java

C:\mytest>java EX5_4
7   14   21   28   35   42   49   56   63   70   77   84   91   98
7���ƪ��ӼơG14
7���Ƥ��`�M�G735

*/