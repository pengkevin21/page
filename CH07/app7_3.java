// app7_3, method的建立
class CRectangle
{
   int width;        
   int height;        
   int area()        // 定義函數成員area(), 用來計算面積
   {
      return width*height;
   }
   
   int perimeter()    // 定義函數成員perimeter(), 用來計算周長
   {
      return 2*(width+height);
   }
}

public class app7_3
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2;
      rect1=new CRectangle();    // 建立新的物件
      rect2=new CRectangle();
 
      rect1.width=10;    // 設定長方形rect1的寬
      rect1.height=5;    // 設定長方形rect1的高
      
      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
      System.out.println("area="+rect2.area());
      System.out.println("perimeter="+rect2.perimeter());
   }
}
/*results
C:\mytest>javac app7_3.java

C:\mytest>java app7_3
area=50
perimeter=30
area=0
perimeter=0
*/