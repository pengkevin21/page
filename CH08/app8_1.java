// app8_1, ������OCCircle�A�[�J�r�ꫬ�A��color����
class CCircle   // �w�q���OCCircle
{
   private String color; 
   private double pi=3.14;    
   private double radius;
 
   public void setColor(String str){    // �]�wcolor��method
      color=str;
   }
   public void setRadius(double r){     // �]�wradius��method
      radius=r;
   }   
   public void setAll(String str, double r){ // �P�ɳ]�wcolor�Pradius
      color=str;    
      radius=r;
   }      
   public void show(){  // �C�L�b�|�B�C��P�ꭱ�n
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_1
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();

      cir1.setColor("Red");     // �]�wcir1��color
      cir1.setRadius(2.0);      // �]�wcir1��radius
      cir1.show();
    
      cir1.setAll("Blue",4.0);  // �P�ɳ]�wcir1��color�Mradius
      cir1.show();     
   }
}  
