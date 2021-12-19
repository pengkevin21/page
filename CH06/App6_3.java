public class App6_3
{
	public static void main(String[] args)
	{
		int i,max,min;
		int a[];
		a=new int[5];
		a[0]=15;
		a[1]=28;
		a[2]=6;
		a[3]=67;
		a[4]=85;
		min=max=a[1];
		for(i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]="+a[i]+",\t");
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.print("\nlength array a is "+a.length);
		System.out.println();
		System.out.println("第0元素值加上第1元素值=  "+(a[0]+a[1]));
		System.out.println("Max="+max);
		System.out.println("Min="+min);
	}
}
/* results
C:\mytest>javac App6_3.java

C:\mytest>java App6_3
a[0]=15,a[1]=28,a[2]=6,a[3]=67,a[4]=85,
length array a is5
第0元素值加上第1元素值=  43
Max=85
Min=6
*/