public class App6_1
{
	public static void main (String args[])
	{
		int i;
		int a[];
		a = new int [3];
		for(i=0;i<3;i++)
		{
			
			System.out.print("a["+i+"]="+a[i]+",\t");
		}
		System.out.println("\nlength of array a is "+ a.length);
	}
}

/* results
C:\mytest>javac App6_1.java

C:\mytest>java App6_1
a[0]=0,  a[1]=0,  a[2]=0,
length of array a is 3

*/