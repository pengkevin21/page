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
   System.out.println((i+1)+"���~�ȭ��~�Z��"+sum[i]+"��");
   System.out.println((i+1)+"���~�ȭ��H1�U�����зǹF����Ҭ�"+avg[i]); 
   
  if(max<sum[i])
   {
    max=sum[i];
    good=i;
   }
 }

  System.out.println((good+1)+"���~�ȭ��~�Z�̦n");
   
 max=sell[0];

 for(int i =0;i<sell.length;i++)
 {   
   System.out.println((i+1)+"�����~�P��q��"+sell[i]+"��");  
   
  if(max<sell[i])
   {
    max=sell[i];
    good=i;
   }
 }

  System.out.println((good+1)+"�����~�P��q�̦n");

 }
 
}

/*
D:\scjp\CH06>javac SellProduct.java

D:\scjp\CH06>java SellProduct
1���~�ȭ��~�Z��5840��
1���~�ȭ��H1�U�����зǹF����Ҭ�0.584
2���~�ȭ��~�Z��4820��
2���~�ȭ��H1�U�����зǹF����Ҭ�0.482
3���~�ȭ��~�Z��6750��
3���~�ȭ��H1�U�����зǹF����Ҭ�0.675
3���~�ȭ��~�Z�̦n
1�����~�P��q��2700��
2�����~�P��q��3750��
3�����~�P��q��5400��
4�����~�P��q��2560��
5�����~�P��q��3000��
3�����~�P��q�̦n

*/