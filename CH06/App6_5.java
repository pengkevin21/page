public class App6_5
{
	public static void main(String[] args)
	{
		int i,j,k,sum=0;
		int a[][][]={{{5,1},{6,7}},{{1,1},{9,5}},{{4,3},{2,5}}};
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				for(k=0;k<a[j].length;k++)
				{
					System.out.print("a["+i+"]["+j+"]["+k+"]=");
					System.out.println(a[i][j][k]);
					sum+=a[i][j][k];
				}
			}
		}
	}	
}
/* results
C:\mytest>javac App6_5.java

C:\mytest>java App6_5
a[0][0][0]=5
a[0][0][1]=1
a[0][1][0]=6
a[0][1][1]=7
a[1][0][0]=1
a[1][0][1]=1
a[1][1][0]=9
a[1][1][1]=5
a[2][0][0]=4
a[2][0][1]=3
a[2][1][0]=2
a[2][1][1]=5
*/