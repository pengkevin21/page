// app8_5, �q�Y�@�غc���I�s�t�@�غc��
class CCircle   // �w�q���OCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public CCircle(){     // �S���޼ƪ��غc��
      this("Green",1.0);       
      System.out.println("constructor CCircle() called"); 
   }   
   public CCircle(String str, double r){ // ���޼ƪ��غc��
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
