import java.io.*;
public class loto_3
{
	public  static void main(String age[])throws IOException
	{
	int i=1,num;   //�ŧi�ܼ�6��
	int a[]=new int[6];
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("�п�J�ռ� : ");
	String str = buf.readLine();
	num = Integer.parseInt(str);
	do
	{
		do
		{
		a[0]=(int)(Math.random()*49);  //�ýX0000000.1~~0.9999999  ��50  �ܦ��Ʀr0-49 ����� �s�Ja1
		}while(a[0]==0);            //a1=0���srun
		System.out.print(a[0]+"  ");  //���a1
		do
		{
			a[1]=(int)(Math.random()*49);
		}while(a[0]==a[1]||a[1]==0);    //a2=0 �ε� a2=a1 ���srun
		System.out.print(a[1]+"  ");
		do
		{
			a[2]=(int)(Math.random()*49);
		}while(a[0]==a[2]||a[1]==a[2]||a[2]==0);	//a3=0 �ε� a3=a1 a3=a2 ���srun
		System.out.print(a[2]+"  ");
		do
		{
			a[3]=(int)(Math.random()*49);
		}while(a[2]==a[3]||a[1]==a[3]||a[0]==a[3]||a[3]==0);	
		System.out.print(a[3]+"  ");
		do
		{
			a[4]=(int)(Math.random()*49);
		}while(a[3]==a[4]||a[2]==a[4]||a[1]==a[4]||a[0]==a[4]||a[4]==0);
		System.out.print(a[4]+"  ");
		do
		{
			a[5]=(int)(Math.random()*49);
		}while(a[4]==a[5]||a[3]==a[5]||a[2]==a[5]||a[1]==a[5]||a[0]==a[5]||a[5]==0);
		System.out.print(a[5]);
		System.out.println();
		i++;
	
	}while(i<=num);
	
	}
}	