// app7_10, ������OCCircle
class CCircle   // �w�q���OCCircle
{
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;
   
   void show_area(){  
      System.out.println("area="+pi*radius*radius);
   }
}

public class app7_10
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();
      cir1.radius=-2.0;
      cir1.show_area();
   }
}  
/*results
C:\mytest>javac app7_10.java

C:\mytest>java app7_10
area=12.56
*/