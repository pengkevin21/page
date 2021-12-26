// app8_5, 從某一建構元呼叫另一建構元
class CCircle   // 定義類別CCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public CCircle(){     // 沒有引數的建構元
      this("Green",1.0);       
      System.out.println("constructor CCircle() called"); 
   }   
   public CCircle(String str, double r){ // 有引數的建構元
      System.out.println("constructor CCircle(String,double) called");
      color=str;    
      radius=r;
   }      
   public void show(){  
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_5
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.show();
   }
}  
