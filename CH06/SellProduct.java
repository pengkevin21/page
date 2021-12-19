public class SellProduct
{

 public static void main(String [] args) 
 {
  int[] array1 = {10,15,20,8,5};
  int[][] array2 = {{100,80,100,80,200},{50,100,80,90,100},{120,70,90,150,300}};
  int[] sum = new int[3];
  int[] sell = new int[5];
  double[] avg = new double[3];
  int max=0,good=0;

 
  for(int j=0;j<array2.length;j++)
  {    
    for(int i=0;i<array1.length;i++)
     {
      sum[j]=sum[j]+array1[i]*array2[j][i];     
     }
     avg[j]=(double)sum[j]/10000;
     
  }  
  
 for(int i=0;i<array1.length;i++)
 {
  for(int j=0;j<array2.length;j++)
  {
    sell[i]=sell[i]+array1[i]*array2[j][i];   
  }
 }  

 max=sum[0];

 for(int i =0;i<sum.length;i++)
 {   
   System.out.println((i+1)+"號業務員業績為"+sum[i]+"元");
   System.out.println((i+1)+"號業務員以1萬元為標準達成比例為"+avg[i]); 
   
  if(max<sum[i])
   {
    max=sum[i];
    good=i;
   }
 }

  System.out.println((good+1)+"號業務員業績最好");
   
 max=sell[0];

 for(int i =0;i<sell.length;i++)
 {   
   System.out.println((i+1)+"號產品銷售量為"+sell[i]+"元");  
   
  if(max<sell[i])
   {
    max=sell[i];
    good=i;
   }
 }

  System.out.println((good+1)+"號產品銷售量最好");

 }
 
}

/*
D:\scjp\CH06>javac SellProduct.java

D:\scjp\CH06>java SellProduct
1號業務員業績為5840元
1號業務員以1萬元為標準達成比例為0.584
2號業務員業績為4820元
2號業務員以1萬元為標準達成比例為0.482
3號業務員業績為6750元
3號業務員以1萬元為標準達成比例為0.675
3號業務員業績最好
1號產品銷售量為2700元
2號產品銷售量為3750元
3號產品銷售量為5400元
4號產品銷售量為2560元
5號產品銷售量為3000元
3號產品銷售量最好

*/