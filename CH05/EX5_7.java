import java.io.*;
public class EX5_7
{
	public static void main (String args[])throws IOException
	{
		int i,count,sum,start,end;
		count=0;
		sum=0;
		String str1,str2;
		BufferedReader buf;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�п�J�_�l�� :");
		str1=buf.readLine();
		start=Integer.parseInt(str1);	
		System.out.print("�п�J�פ�� :");
		str2=buf.readLine();
		end=Integer.parseInt(str2);
/********************************for �j��*****************************************/		
		for(i=start;i<=end;i++)
		{
			if ( i % 2 == 0 || i % 3 == 0)
			{	
				sum=sum+i;
				count=count+1;
				System.out.print(i+"   ");
			}
	    }
		System.out.println();
		System.out.println("2��3���ƪ��ӼơG" + count);	
		System.out.println("2��3���Ƥ��`�M�G" + sum);
		System.out.println();
/******************************while �j��*****************************************/        
		count=0;
		sum=0;
		i=start;
		while(i<=end)
		{
			if ( i % 2 == 0 || i % 3 == 0)
			{	
				sum=sum+i;
				count=count+1;
				System.out.print(i+"   ");
			}
			i=i+1;
		}
		System.out.println();
		System.out.println("2��3���ƪ��ӼơG" + count);	
		System.out.println("2��3���Ƥ��`�M�G" + sum);
		System.out.println();
/******************************do while �j��***************************************/  
        count=0;
		sum=0;
		i=start;
		do
		{
			if ( i % 2 == 0 || i % 3 == 0)
			{	
				sum=sum+i;
				count=count+1;
				System.out.print(i+"   ");
			}
			i=i+1;
		}while(i<=end);
		System.out.println();
		System.out.println("2��3���ƪ��ӼơG" + count);	
		System.out.println("2��3���Ƥ��`�M�G" + sum);
		System.out.println();

		
	}
}
/* results
C:\mytest>javac EX5_7.java

C:\mytest>java EX5_7
2��3���ƪ��ӼơG67
2��3���Ƥ��`�M�G3417

*/