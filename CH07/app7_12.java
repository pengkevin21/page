// app7_12, 公有成員(method)的建立
class CCircle   // 定義類別CCircle
{
   private double pi=3.14;    // 將資料成員設定為private
   private double radius;
  
   public void show_area(){   // 將method設定public
      System.out.println("area="+pi*radius*radius);
   }
   public void setRadius(double r){  
      if(r>0){
         radius=r;      // 將私有成員radius設為r
         System.out.println("radius="+radius);
      }
      else
         System.out.println("input error");
   }  
}

public class app7_12
{
   public static void main(String args[])
   {
      CCircle cir1=new CCircle();  
      cir1.setRadius(-2.0);
      cir1.show_area();
   }
}
/*results
C:\mytest>javac app7_12.java

C:\mytest>java app7_12
input error
area=0.0
*/