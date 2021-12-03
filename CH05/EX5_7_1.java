public class EX5_7_1
{
	public static void main (String args[])
	{
		int i;
		int sum=0;
		int count=0;
		
		for(i=1;i<=100;i++)
		{
			if ( i % 2 == 0 || i % 3 == 0)
			{	
				sum=sum+i;
				count=count+1;
				System.out.print(i+"   ");
			}
	    }
		System.out.println();
		System.out.println("2或3倍數的個數：" + count);	
		System.out.println("2或3倍數之總和：" + sum);
		System.out.println();
	}
}