// app7_1, �إߪ���Pfield���s��
class CRectangle    // �w�qCRectangle���O
{
   int width=7;         // �ŧi��Ʀ���width 
   int height=8;        // �ŧi��Ʀ���height
}

public class app7_1
{
   public static void main(String args[])
   {
      CRectangle rect1;
      rect1=new CRectangle();    // �إ߷s������
 
      rect1.width=10;    // �]�w�����rect1���e
      rect1.height=5;    // �]�w�����rect1����
    
      System.out.println("width="+rect1.width);  // �L�Xrect1.width
      System.out.println("height="+rect1.height); // �L�Xrect1.height
   }
}
/*results
C:\mytest>javac app7_1.java

C:\mytest>java app7_1
width=10
height=5
*/
