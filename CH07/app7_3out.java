// app7_3, method���إ�
class CRectangle
{
   int width;        
   int height;
   double pi=3.14;    // �N��Ʀ����]�w���
   double radius;
   
   double show_area(){     // show_area() method, ��ܥX�ꭱ�n
      return pi*radius*radius;
         }        
   int area()        // �w�q��Ʀ���area(), �Ψӭp�⭱�n
   {
      return width*height;
   }
   
   int perimeter()    // �w�q��Ʀ���perimeter(), �Ψӭp��P��
   {
      return 2*(width+height);
   }
}


public class app7_3out
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2,c1;
      rect1=new CRectangle();    // �إ߷s������
      rect2=new CRectangle();
      c1=new CRectangle();
      
 
      rect1.width=10;    // �]�w�����rect1���e
      rect1.height=5;    // �]�w�����rect1����
      c1.radius=20;
      
      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
      System.out.println("area="+rect2.area());
      System.out.println("perimeter="+rect2.perimeter());
      System.out.println("Circle area="+c1.show_area());
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("rect1.width="+rect1.width);  // �L�Xrect1.width
      System.out.println("rect1.height="+rect1.height); // �L�Xrect1.height
      System.out.println("rect1.pi="+rect1.pi);  // �L�Xrect1.width
      System.out.println("rect1.radius="+rect1.radius); // �L�Xrect1.height
      System.out.println("rect2.width="+rect2.width);  // �L�Xrect1.width
      System.out.println("rect2.height="+rect2.height); // �L�Xrect1.height
      System.out.println("rect2.pi="+rect2.pi);  // �L�Xrect1.width
      System.out.println("rect2.radius="+rect2.radius); // �L�Xrect1.height
      System.out.println("c1.width="+c1.width);  // �L�Xrect1.width
      System.out.println("c1.width="+c1.width);  // �L�Xrect1.width
      System.out.println("c1.pi="+c1.pi);  // �L�Xrect1.width
      System.out.println("c1.radius="+c1.radius); // �L�Xrect1.height
      
   }
}
/*results
C:\mytest>javac app7_3.java

C:\mytest>java app7_3
area=50
perimeter=30
area=0
perimeter=0
Circle area=1256.0
*/