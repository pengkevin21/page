public class App6_4
{
	public static void main(String[] args)
	{
		int i,j;
		int sum=0;
		int a[][]={{22,11,33,44},{10,20,30,40}};
		for(i=0;i<a.length;i++)
		{
			
			System.out.print("�~�ȭ�"+(i+1)+"���~�Z: ");
			
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
		System.out.println("�`�M: "+sum);
	}
}
/* results
C:\mytest>javac App6_4.java

C:\mytest>java App6_4
�~�ȭ�1���~�Z: 22       11      33      44
�~�ȭ�2���~�Z: 10       20      30      40

length array a is: 2
length array a[0] is: 4

�`�M: 210
*/