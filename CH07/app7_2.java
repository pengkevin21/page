// app7_2, �إߪ���Pfield���s��
class CRectangle    // �w�qCRectangle���O
{
   int width;         // �ŧi��Ʀ���width 
   int height;        // �ŧi��Ʀ���height
}

public class app7_2
{
   public static void main(String args[])
   {
      
      CRectangle rect1=new CRectangle();
      CRectangle rect2=new CRectangle();
      CRectangle rect3=new CRectangle();    // �إ߷s������
 
      rect1.width=10;    // �]�w�����rect1���e
      rect1.height=5;    // �]�w�����rect1����
      rect2.width=12;    // �]�w�����rect2���e
      rect2.height=rect1.height+3;    // �]�w�����rect2����
    
      System.out.println("width="+rect1.width);  // �L�Xrect1.width
      System.out.println("height="+rect1.height); // �L�Xrect1.height
      System.out.println("width="+rect2.width);  // �L�Xrect2.width
      System.out.println("height="+rect2.height); // �L�Xrect2.height
      System.out.println("width="+rect3.width);  // �L�Xrect3.width
      System.out.println("height="+rect3.height); // �L�Xrect3.height
   }
}
/*results
C:\mytest>javac app7_2.java

C:\mytest>java app7_2
width=10
height=5
width=12
height=8
width=0
height=0
*/
