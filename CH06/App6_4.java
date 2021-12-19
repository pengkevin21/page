public class App6_4
{
	public static void main(String[] args)
	{
		int i,j;
		int sum=0;
		int a[][]={{22,11,33,44},{10,20,30,40}};
		for(i=0;i<a.length;i++)
		{
			
			System.out.print("業務員"+(i+1)+"的業績: ");
			
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				sum+=a[i][j];
			}
			System.out.println();
		}
		System.out.println("\nlength array a is: "+a.length);
		System.out.println("length array a[0] is: "+a[0].length);
		System.out.println();
		System.out.println("總和: "+sum);
	}
}
/* results
C:\mytest>javac App6_4.java

C:\mytest>java App6_4
業務員1的業績: 22       11      33      44
業務員2的業績: 10       20      30      40

length array a is: 2
length array a[0] is: 4

總和: 210
*/