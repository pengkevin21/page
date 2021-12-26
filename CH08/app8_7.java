// app8_7, 簡單的範例,實例變數與實例方法
class CCircle   // 定義類別CCircle
{
   private double pi=3.14;
   private double radius;
 
   public CCircle(double r){ // CCircle()建構元
      radius=r;
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_7
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      cir1.show();
      CCircle cir2=new CCircle(2.0);
      cir2.show();
   }
}  

