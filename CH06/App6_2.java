public class App6_2
{
	public static void main (String args[])
	{
		int i;
		int a[]={15,6,8};

		for(i=0;i<a.length;i++)
		{
			
			System.out.print("a["+i+"]="+a[i]+",\t");
		}
		System.out.print("\nlength of array a is "+ a.length);
	}
}

/* results
C:\mytest>javac App6_2.java

C:\mytest>java App6_2
a[0]=15, a[1]=6, a[2]=8,
length of array a is 3

*/