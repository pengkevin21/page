//Hank's practice Array
public class sale
{
	public static void main(String args[])
	{
		int i,j;
		int value[] ={10,20,5,30,15};
		int sales[][]={{100,80,100,90,110},
			       {80,50,70,80,50},
			       {50,120,80,120,60}};
		int sum[] = new int[3];
		int valuesum[]= new int[5];
		int max=sum[0],maxindex=0;
		
		for(j=0;j<sales.length;j++)
		{
			for(i=0;i<value.length;i++)
			{
				sum[j] += value[i]*sales[j][i];
			}
			if(sum[j]>max)
			{
				max=sum[j];
				maxindex=j+1;
			}
			System.out.println("�P���"+(j+1)+"���~�Z:"+sum[j]+"��F����v:"+(sum[j]/(float)10000));
			
		}
		System.out.println("�P���"+maxindex+"�㦳�̦n���~�Z");

		max=valuesum[0];
		for(j=0;j<value.length;j++)
		{
			for(i=0;i<sales.length;i++)
			{
				valuesum[j] += value[j]*sales[i][j];
			}
			if(valuesum[j]>max)
			{
				max=valuesum[j];
				maxindex=j+1;
			}
			System.out.println("���~"+(j+1)+"���P���`�B:"+valuesum[j]+"��F����v:"+(valuesum[j]/(float)10000));
			
		}
		System.out.print("���~"+maxindex+"�̦n��");
	}
}