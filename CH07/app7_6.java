// app7_6, �b���O�����I�smethod
class CCircle   // �w�q���OCCircle
{
  double pi=3.14;    // �N��Ʀ����]�w���
  double radius;
  
  void show_area(){     // show_area() method, ��ܥX�ꭱ�n
     System.out.println("area="+pi*radius*radius);
  }   
  void show_all(){   // show_all() method, �P����ܥX�b�|�P�ꭱ�n
     System.out.println("radius="+radius);
     show_area();     // �����O���I�sshow_area() method
  }
}

public class app7_6
{
  public static void main(String args[])
  {
     CCircle cir1=new CCircle();   // �ŧi�ëإ߷s������
     cir1.radius=2.0;
     cir1.show_all();   // �I�scir1��show_all() method
  }
}  
/*results
C:\mytest>javac app7_6.java
C:\mytest>java app7_6
radius=2.0
area=12.56
*/