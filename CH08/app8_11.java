// app8_11, ���O���A���ܼƪ�����
class CCircle   // �w�q���OCCircle
{
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){ // �P�ɳ]�wcolor�Pradius
      radius=r;
   }
   public void setRadius(double r){ // �P�ɳ]�wcolor�Pradius
      radius=r;
   }         
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_11
{
   public static void main(String args[])
   {
      CCircle cir1,cir2;
      cir1=new CCircle(1.0);
      cir1.show(); 
           
      cir2=cir1;
      cir2.setRadius(2.0);
      cir1.show();
   }
}  

