
public class App6_9
{
	public static void main(String[] args) 
	{
		int score[]={5,3,6,57,19,27};
		largest(score);		
	}	
	public static void largest(int arr[])
	{
		int tmp1=arr[0];
		int tmp2=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(tmp1<arr[i])
				tmp1=arr[i];
			if(tmp2>arr[i])
				tmp2=arr[i];
		}
		System.out.println("largest num= "+tmp1);
		System.out.println("smallest num= "+tmp2);
	}
	
}
/* results
C:\mytest>javac App6_9.java

C:\mytest>java App6_9
largest num= 57
smallest num= 3
*/