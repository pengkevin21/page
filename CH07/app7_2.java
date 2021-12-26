// app7_2, 建立物件與field的存取
class CRectangle    // 定義CRectangle類別
{
   int width;         // 宣告資料成員width 
   int height;        // 宣告資料成員height
}

public class app7_2
{
   public static void main(String args[])
   {
      
      CRectangle rect1=new CRectangle();
      CRectangle rect2=new CRectangle();
      CRectangle rect3=new CRectangle();    // 建立新的物件
 
      rect1.width=10;    // 設定長方形rect1的寬
      rect1.height=5;    // 設定長方形rect1的高
      rect2.width=12;    // 設定長方形rect2的寬
      rect2.height=rect1.height+3;    // 設定長方形rect2的高
    
      System.out.println("width="+rect1.width);  // 印出rect1.width
      System.out.println("height="+rect1.height); // 印出rect1.height
      System.out.println("width="+rect2.width);  // 印出rect2.width
      System.out.println("height="+rect2.height); // 印出rect2.height
      System.out.println("width="+rect3.width);  // 印出rect3.width
      System.out.println("height="+rect3.height); // 印出rect3.height
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
