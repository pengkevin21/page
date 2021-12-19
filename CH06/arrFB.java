import java.io.*;
public class arrFB
{
	public static void main(String args[])throws IOException
	{
		int tmp,num,i;
		
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("總共要輸入多少數值: ");					//輸入要排序的數共有
		String str=buf.readLine();
		num=Integer.parseInt(str);
		
		int a[]=new int[num];
		
		for(i=0;i<a.length;i++)								//取?個要排序的數字
		{
			System.out.print("請輸入第"+(i+1)+"個數：");
			String str1=buf.readLine();
			a[i]=Integer.parseInt(str1);
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