public class arr
{
	public static void main(String[] args)
	{
		int a[][]={{33,32,56,45,33},{77,33,68,45,23},{43,55,43,67,65}};
		int b[]={12,16,10,14,15};
		int i;
		int sum1=0,sum2=0,sum3=0,suma=0,sumb=0,sumc=0,sumd=0,sume=0;
		int sum;
		
		for(i=0;i<a.length;i++)
		{
			System.out.print("銷售員"+(i+1)+"的業績: ");
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}System.out.println();
		}
		System.out.println();
		
		for(int k=0;k<5;k++)
		{
			sum1+=(b[k]*a[0][k]);
			sum2+=(b[k]*a[1][k]);
			sum3+=(b[k]*a[2][k]);			
		}
		
		System.out.println("銷售員1的總銷售金額: "+sum1);
		System.out.println("銷售員2的總銷售金額: "+sum2);
		System.out.println("銷售員3的總銷售金額: "+sum3);
		System.out.println();
		
		if((sum1>sum2)&&(sum1>sum3))
			System.out.println("銷售員1業績最好!");
			
		if((sum2>sum1)&&(sum2>sum3))
			System.out.println("銷售員2業績最好!");
			
		if((sum3>sum1)&&(sum3>sum2))
			System.out.println("銷售員3業績最好!");
		System.out.println();
		
		for(int l=0;l<3;l++)
		{
			suma+=(b[0]*a[l][0]);
			sumb+=(b[1]*a[l][1]);
			sumc+=(b[2]*a[l][2]);
			sumd+=(b[3]*a[l][3]);
			sume+=(b[4]*a[l][4]);
		}
		
		System.out.println("產品a的總銷售金額: "+suma);
		System.out.println("產品b的總銷售金額: "+sumb);
		System.out.println("產品c的總銷售金額: "+sumc);
		System.out.println("產品d的總銷售金額: "+sumd);
		System.out.println("產品e3的總銷售金額: "+sume);
		System.out.println();
		
		if((suma>sumb)&&(suma>sumc)&&(suma>sumd)&&(suma>sume))
			System.out.println("產品a的銷售最好!");
			
		if((sumb>suma)&&(sumb>sumc)&&(sumb>sumd)&&(sumb>sume))
			System.out.println("產品b的銷售最好!");
			
		if((sumc>sumb)&&(sumc>sumb)&&(sumc>sumd)&&(sumc>sume))
			System.out.println("產品c的銷售最好!");
			
		if((sumd>suma)&&(sumd>sumb)&&(sumd>sumc)&&(sumd>sume))
			System.out.println("產品d的銷售最好!");
			
		if((sume>suma)&&(sume>sumb)&&(sume>sumc)&&(sume>sumd))
			System.out.println("產品e的銷售最好!");		
	}
	
	
}