//可以自行輸入想排序的數
import java.util.Scanner;
public class arrF
{
	public static void main(String args[])
	{
		int tmp,num,i;
		
		System.out.print("總共有幾個數：");					//輸入要排序的數共有
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		
		int a[]=new int[num];
		
		for(i=0;i<a.length;i++)								//取?個要排序的數字
		{
			System.out.print("請輸入第"+(i+1)+"個數：");
			a[i]=scan.nextInt();	
		}
		
		System.out.print("\n排序前的陣列為：");		
		for(i=0;i<a.length;i++)								//印出排序前的陣列
		{
			System.out.print(a[i]+" ");	
		}
		
		for(i=a.length;i>1;i--)								//從小到大的排序
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
		for(i=0;i<a.length;i++)								//排序後的陣列為
		{
			System.out.print(a[i]+" ");	
		}
		
		System.out.println("\n此陣列最大值為："+a[a.length-1]);
		System.out.println("此陣列最小值為："+a[0]);
	}	
}
/*
總共有幾個數：10
請輸入第1個數：10
請輸入第2個數：9
請輸入第3個數：8
請輸入第4個數：7
請輸入第5個數：6
請輸入第6個數：5
請輸入第7個數：4
請輸入第8個數：3
請輸入第9個數：2
請輸入第10個數：1

排序前的陣列為：10 9 8 7 6 5 4 3 2 1
排序後的陣列為：1 2 3 4 5 6 7 8 9 10
此陣列最大值為：10
此陣列最小值為：1
*/