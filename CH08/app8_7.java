// app8_7, ²�檺�d��,����ܼƻP��Ҥ�k
class CCircle   // �w�q���OCCircle
{
   private double pi=3.14;
   private double radius;
 
   public CCircle(double r){ // CCircle()�غc��
      radius=r;
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_7
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle(1.0);
      cir1.show();
      CCircle cir2=new CCircle(2.0);
      cir2.show();
   }
}  

