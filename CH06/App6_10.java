
public class App6_10
{
	public static void main(String[] args) 
	{
		int arr[][]={{22,31,66,55},{11,33,77,88}};
		largest(arr);		
	}	
	public static void largest(int arr[][])
	{
		int tmp1=arr[0][0];
		int tmp2=arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				if(tmp1<arr[i][j])
					tmp1=arr[i][j];
				if(tmp2>arr[i][j])
					tmp2=arr[i][j];
			}
			System.out.println();
		}
		System.out.println("largest num= "+tmp1);
		System.out.println("smallest num= "+tmp2);
		
	}
	
}
/* results
C:\mytest>javac App6_10.java

C:\mytest>java App6_10
22 31 66 55
11 33 77 88
largest num= 88
smallest num= 11
*/