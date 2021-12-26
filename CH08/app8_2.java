// app8_2, 函數的多載
class CCircle   // 定義類別CCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public void setCircle(String str){  // 設定color成員
      color=str;
   }
   public void setCircle(double r){     // 設定radius成員
      radius=r;
   }   
   public void setCircle(String str, double r){// 同時設定color與radius
      color=str;    
      radius=r;
   }      
   public void show(){  
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_2
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();

      cir1.setCircle("Red");   // 呼叫第8行的setCircle() method
      cir1.setCircle(2.0);     // 呼叫第9行的setCircle() method
      cir1.show();
    
      cir1.setCircle("Blue",4.0);  // 呼叫第14行的setCircle() method
      cir1.show();     
   }
}  
