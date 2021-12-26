// app8_11, 類別型態之變數的應用
class CCircle   // 定義類別CCircle
{
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){ // 同時設定color與radius
      radius=r;
   }
   public void setRadius(double r){ // 同時設定color與radius
      radius=r;
   }         
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_11
{
   public static void main(String args[])
   {
      CCircle cir1,cir2;
      cir1=new CCircle(1.0);
      cir1.show(); 
           
      cir2=cir1;
      cir2.setRadius(2.0);
      cir1.show();
   }
}  

