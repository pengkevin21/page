// app8_4,�غc�����h��
class CCircle   // �w�q���OCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public CCircle(){     // �S���޼ƪ��غc��
      System.out.println("constructor CCircle() called");   
      radius=1.0;
      color="Green";
   }   
   public CCircle(String str, double r){ // ������ܼƪ��غc��
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
