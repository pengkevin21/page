// app8_14, �إߪ���}�C
class CCircle   // �w�q���OCCircle
{
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){       // CCircle�غc��
      radius=r;
   }
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app8_14
{
   public static void main(String args[])
   {
      CCircle cir[];
      cir=new CCircle[3];
      cir[0]=new CCircle(1.0);
      cir[1]=new CCircle(4.0); 
      cir[2]=new CCircle(2.0);      
      
      cir[1].show();   // �Q�Ϊ���cir[1]�I�sshow() method
      cir[2].show();   // �Q�Ϊ���cir[2]�I�sshow() method
   }
}  

