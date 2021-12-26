// app7_3, method的建立
class CRectangle
{
   int width;        
   int height;
   double pi=3.14;    // 將資料成員設定初值
   double radius;
   
   double show_area(){     // show_area() method, 顯示出圓面積
      return pi*radius*radius;
         }        
   int area()        // 定義函數成員area(), 用來計算面積
   {
      return width*height;
   }
   
   int perimeter()    // 定義函數成員perimeter(), 用來計算周長
   {
      return 2*(width+height);
   }
}


public class app7_3out
{
   public static void main(String args[])
   {
      CRectangle rect1,rect2,c1;
      rect1=new CRectangle();    // 建立新的物件
      rect2=new CRectangle();
      c1=new CRectangle();
      
 
      rect1.width=10;    // 設定長方形rect1的寬
      rect1.height=5;    // 設定長方形rect1的高
      c1.radius=20;
      
      System.out.println("area="+rect1.area());
      System.out.println("perimeter="+rect1.perimeter());
      System.out.println("area="+rect2.area());
      System.out.println("perimeter="+rect2.perimeter());
      System.out.println("Circle area="+c1.show_area());
      System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
      System.out.println("rect1.width="+rect1.width);  // 印出rect1.width
      System.out.println("rect1.height="+rect1.height); // 印出rect1.height
      System.out.println("rect1.pi="+rect1.pi);  // 印出rect1.width
      System.out.println("rect1.radius="+rect1.radius); // 印出rect1.height
      System.out.println("rect2.width="+rect2.width);  // 印出rect1.width
      System.out.println("rect2.height="+rect2.height); // 印出rect1.height
      System.out.println("rect2.pi="+rect2.pi);  // 印出rect1.width
      System.out.println("rect2.radius="+rect2.radius); // 印出rect1.height
      System.out.println("c1.width="+c1.width);  // 印出rect1.width
      System.out.println("c1.width="+c1.width);  // 印出rect1.width
      System.out.println("c1.pi="+c1.pi);  // 印出rect1.width
      System.out.println("c1.radius="+c1.radius); // 印出rect1.height
      
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