// app8_2, ��ƪ��h��
class CCircle   // �w�q���OCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;
 
   public void setCircle(String str){  // �]�wcolor����
      color=str;
   }
   public void setCircle(double r){     // �]�wradius����
      radius=r;
   }   
   public void setCircle(String str, double r){// �P�ɳ]�wcolor�Pradius
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

      cir1.setCircle("Red");   // �I�s��8�檺setCircle() method
      cir1.setCircle(2.0);     // �I�s��9�檺setCircle() method
      cir1.show();
    
      cir1.setCircle("Blue",4.0);  // �I�s��14�檺setCircle() method
      cir1.show();     
   }
}  
