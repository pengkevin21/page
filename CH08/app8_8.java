// app8_8, 「類別變數」的使用
class CCircle   // 定義類別CCircle
{
   private static int num=0;         // 設定num為「類別變數」
   private static double pi=3.14;   // 設定pi為「類別變數」
   private double radius;
 
   public CCircle(double r){ // CCircle建構元
      radius=r;
      num++;       // 當CCircle()建構元被呼叫時，num便加1
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
   public void count(){   // count() method，用來顯示目前物件建立的個數
      System.out.println(num+" object(s) created");      
   }   
}

public class app8_8
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      cir1.count();       // 用cir1物件呼叫count() method
      CCircle cir2=new CCircle(2.0);
      cir1.count();       // 用cir1物件呼叫count() method
      cir2.count();       // 改用cir2物件呼叫count() method
   }
}  

