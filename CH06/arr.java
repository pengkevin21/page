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
			System.out.print("�P���"+(i+1)+"���~�Z: ");
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
		
		System.out.println("�P���1���`�P����B: "+sum1);
		System.out.println("�P���2���`�P����B: "+sum2);
		System.out.println("�P���3���`�P����B: "+sum3);
		System.out.println();
		
		if((sum1>sum2)&&(sum1>sum3))
			System.out.println("�P���1�~�Z�̦n!");
			
		if((sum2>sum1)&&(sum2>sum3))
			System.out.println("�P���2�~�Z�̦n!");
			
		if((sum3>sum1)&&(sum3>sum2))
			System.out.println("�P���3�~�Z�̦n!");
		System.out.println();
		
		for(int l=0;l<3;l++)
		{
			suma+=(b[0]*a[l][0]);
			sumb+=(b[1]*a[l][1]);
			sumc+=(b[2]*a[l][2]);
			sumd+=(b[3]*a[l][3]);
			sume+=(b[4]*a[l][4]);
		}
		
		System.out.println("���~a���`�P����B: "+suma);
		System.out.println("���~b���`�P����B: "+sumb);
		System.out.println("���~c���`�P����B: "+sumc);
		System.out.println("���~d���`�P����B: "+sumd);
		System.out.println("���~e3���`�P����B: "+sume);
		System.out.println();
		
		if((suma>sumb)&&(suma>sumc)&&(suma>sumd)&&(suma>sume))
			System.out.println("���~a���P��̦n!");
			
		if((sumb>suma)&&(sumb>sumc)&&(sumb>sumd)&&(sumb>sume))
			System.out.println("���~b���P��̦n!");
			
		if((sumc>sumb)&&(sumc>sumb)&&(sumc>sumd)&&(sumc>sume))
			System.out.println("���~c���P��̦n!");
			
		if((sumd>suma)&&(sumd>sumb)&&(sumd>sumc)&&(sumd>sume))
			System.out.println("���~d���P��̦n!");
			
		if((sume>suma)&&(sume>sumb)&&(sume>sumc)&&(sume>sumd))
			System.out.println("���~e���P��̦n!");		
	}
	
	
}