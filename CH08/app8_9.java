// app8_9, �u���O��k�v���ϥ�
class CCircle   // �w�q���OCCircle
{
   private static int num=0;
   private static double pi=3.14;   
   private double radius;
 
   public CCircle(double r){ 
      radius=r;
      num++;
   }      
   public void show(){  
      System.out.println("area="+pi*radius*radius);
   }
   public static void count(){  // �ŧiconut()���u���O��k�v
      System.out.println(num+" object(s) created");      
   }   
}

public class app8_9
{
   public static void main(String args[])
   {
      CCircle.count();      // ��CCircle���O�I�scount() method
      CCircle cir1=new CCircle(1.0);
      CCircle.count();      // ��CCircle���O�I�scount() method
      CCircle cir2=new CCircle(2.0);
      CCircle.count();      // ��CCircle���O�I�scount() method
   }
}  


