import java.io.*;

public class A61
{
  public static void main(String args[]) throws IOException
  {

	int R,C,i,j,tmp,tmp1,total;
	BufferedReader buf;
	String str,str1,str2,str3;
	buf=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("�п�J�~�ȭ��ƶq:");
	str1=buf.readLine();
        R=Integer.parseInt(str1);
	System.out.print("�п�J���X�ز��~:");
	str2=buf.readLine();
        C=Integer.parseInt(str2);

	int p[]=new int[C];
	int s[][]=new int [R][C];
	int sp[]=new int [R];
        int sq[]=new int [C];

   for(i=0;i<C;i++)
   {
     System.out.print("�п�J���~"+(i+1)+"������");
     str=buf.readLine();
        tmp=Integer.parseInt(str);
      p[i]=tmp; 
          
   }

   for(i=0;i<R;i++)
   {
     for(j=0;j<C;j++){
     System.out.print("�п�J�P���"+(i+1)+"�P�ⲣ�~"+(j+1)+"���P��q��:");
     str3=buf.readLine();
        tmp1=Integer.parseInt(str3);
      s[i][j]=tmp1;}
	System.out.println(); 
          
   }


   for(i=0;i<R;i++)
   {
     for(j=0;j<C;j++)
     {
     sp[i]+=s[i][j]*p[j]; 
     }

   }


   for(i=0;i<C;i++)
   {
     for(j=0;j<R;j++)
     {
     sq[i]+=s[j][i]*p[i]; 
     }

   }

  primat(R,sp);
    /*for(i=0;i<R;i++)
    {
	System.out.println("�P���"+(i+1)+"���P���B��:"+sp[i]);
    }*/

    for(i=0;i<C;i++)
    {
	System.out.println("���~"+(i+1)+"���P���B��:"+sq[i]);
    }

  }

public static void primat(int k,int sss[])
{
 for(int i=0;i<k;i++)
 {
  System.out.println("�P���"+(i+1)+"���P���B��:"+sss[i]);
 }
} 
}