// app8_4,建構元的多載
class CCircle   // 定義類別CCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public CCircle(){     // 沒有引數的建構元
      System.out.println("constructor CCircle() called");   
      radius=1.0;
      color="Green";
   }   
   public CCircle(String str, double r){ // 有兩個變數的建構元
      System.out.println("constructor CCircle(String,double) called"); 
      color=str;    
      radius=r;
   }      
   public void show(){  
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_4
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.show();
      
      CCircle cir2=new CCircle("Blue",4.0);    
      cir2.show();     
   }
}  
