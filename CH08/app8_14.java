// app8_14, 建立物件陣列
class CCircle   // 定義類別CCircle
{
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){       // CCircle建構元
      radius=r;
   }
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_14
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0); 
      cir[2]=new CCircle(2.0);      
      
      cir[1].show();   // 利用物件cir[1]呼叫show() method
      cir[2].show();   // 利用物件cir[2]呼叫show() method
   }
}  

