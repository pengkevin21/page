// app7_4, ������OCCircle
class CCircle   // �w�q���OCCircle
{
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;
   
   void show_area(){     // show_area() method, ��ܥX�ꭱ�n
      System.out.println("area="+pi*radius*radius);
   }
}

public class app7_4
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // �ŧi�ëإ߷s������
      cir1.radius=2.0;
      cir1.show_area();
   }
}  
/*results
C:\mytest>javac app7_4.java
C:\mytest>java app7_4
area=12.56
*/