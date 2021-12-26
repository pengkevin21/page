// app7_1, 建立物件與field的存取
class CRectangle    // 定義CRectangle類別
{
   int width=7;         // 宣告資料成員width 
   int height=8;        // 宣告資料成員height
}

public class app7_1
{
   public static void main(String args[])
   {
      CRectangle rect1;
      rect1=new CRectangle();    // 建立新的物件
 
      rect1.width=10;    // 設定長方形rect1的寬
      rect1.height=5;    // 設定長方形rect1的高
    
      System.out.println("width="+rect1.width);  // 印出rect1.width
      System.out.println("height="+rect1.height); // 印出rect1.height
   }
}
/*results
C:\mytest>javac app7_1.java

C:\mytest>java app7_1
width=10
height=5
*/
