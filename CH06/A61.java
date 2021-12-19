import java.io.*;

public class A61
{
  public static void main(String args[]) throws IOException
  {

	int R,C,i,j,tmp,tmp1,total;
	BufferedReader buf;
	String str,str1,str2,str3;
	buf=new BufferedReader(new InputStreamReader(System.in));

	System.out.print("請輸入業務員數量:");
	str1=buf.readLine();
        R=Integer.parseInt(str1);
	System.out.print("請輸入有幾種產品:");
	str2=buf.readLine();
        C=Integer.parseInt(str2);

	int p[]=new int[C];
	int s[][]=new int [R][C];
	int sp[]=new int [R];
        int sq[]=new int [C];

   for(i=0;i<C;i++)
   {
     System.out.print("請輸入產品"+(i+1)+"的價格");
     str=buf.readLine();
        tmp=Integer.parseInt(str);
      p[i]=tmp; 
          
   }

   for(i=0;i<R;i++)
   {
     for(j=0;j<C;j++){
     System.out.print("請輸入銷售員"+(i+1)+"銷售產品"+(j+1)+"的銷售量為:");
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
	System.out.println("銷售員"+(i+1)+"的銷售額為:"+sp[i]);
    }*/

    for(i=0;i<C;i++)
    {
	System.out.println("產品"+(i+1)+"的銷售額為:"+sq[i]);
    }

  }

public static void primat(int k,int sss[])
{
 for(int i=0;i<k;i++)
 {
  System.out.println("銷售員"+(i+1)+"的銷售額為:"+sss[i]);
 }
} 
}