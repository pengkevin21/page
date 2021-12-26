// app7_9, 圓形類別CCircle
class CCircle   // 定義類別CCircle
{
   double pi;    // 將資料成員設定初值
   double radius;
 
   double getRadius(){
      return radius;
   }

   void setCircle(double r, double p){     
      pi=p;
      radius=r;   
   }
}

public class app7_9
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();   // 宣告並建立新的物件
      cir1.setCircle(2.0,3.1416);
      System.out.println("radius="+cir1.getRadius()); 
   }
}  
/*results
C:\mytest>javac app7_9.java
C:\mytest>java app7_9
radius=2.0
*/