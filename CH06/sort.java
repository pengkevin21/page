public class sort
{
	public static void main(String args[])
	{
		int tmp;
		//int a[]={74,48,30,17,62};					//直接給固定值
		int a[]={5,4,3,2,1};
		
		System.out.print("排序前的陣列為：");		
		for(int i=0;i<a.length;i++)					//印出排序前
		{
			System.out.print(a[i]+" ");	
		}
		
		for(int i=a.length;i>1;i--)					//從小到大的排序
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					tmp=a[j+1];
					a[j+1]=a[j];
					a[j]=tmp;
				}
			}
		}
		
		
		System.out.print("\n排序後的陣列為：");
		for(int i=0;i<a.length;i++)					//印出排序後
		{
			System.out.print(a[i]+" ");	
		}
		
		System.out.println("\n陣列最大值為"+a[4]);
		System.out.println("陣列最小值為"+a[0]);
	}	
}
/*
排序前的陣列為：74 48 30 17 62
排序後的陣列為：17 30 48 62 74
陣列最大值為74
陣列最小值為17
*/