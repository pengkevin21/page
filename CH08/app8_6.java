// app8_6, �����P�p���غc��
class CCircle   // �w�q���OCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   private CCircle(){     // �p���غc��
      System.out.println("private constructor called"); 
   }   
   public CCircle(String str, double r){ // �����غc��
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

