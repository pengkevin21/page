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
			System.out.println("銷售員"+(j+1)+"的業績:"+sum[j]+"其達成比率:"+(sum[j]/(float)10000));
			
		}
		System.out.println("銷售員"+maxindex+"具有最好的業績");

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
			System.out.println("產品"+(j+1)+"的銷售總額:"+valuesum[j]+"其達成比率:"+(valuesum[j]/(float)10000));
			
		}
		System.out.print("產品"+maxindex+"最好賣");
	}
}