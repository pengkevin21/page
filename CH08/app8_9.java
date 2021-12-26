// app8_9, 「類別方法」的使用
class CCircle   // 定義類別CCircle
{
   private static int num=0;
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){ 
      radius=r;
      num++;
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
   public static void count(){  // 宣告conut()為「類別方法」
      System.out.println(num+" object(s) created");      
   }   
}

public class app8_9
{
   public static void main(String args[])
   {
      CCircle.count();      // 用CCircle類別呼叫count() method
      CCircle cir1=new CCircle(1.0);
      CCircle.count();      // 用CCircle類別呼叫count() method
      CCircle cir2=new CCircle(2.0);
      CCircle.count();      // 用CCircle類別呼叫count() method
   }
}  


