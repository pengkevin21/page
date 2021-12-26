// app8_6, 公有與私有建構元
class CCircle   // 定義類別CCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   private CCircle(){     // 私有建構元
      System.out.println("private constructor called"); 
   }   
   public CCircle(String str, double r){ // 公有建構元
      this();
      color=str;    
      radius=r;
   }      
   public void show(){  
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_6
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle("Blue",1.0);
      cir1.show();
   }
}  

