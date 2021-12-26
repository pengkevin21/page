// app8_19, 匿名內部類別
public class app8_19
{
   public static void main(String args[])
   {  
      (
         new Caaa()  // 建立匿名內部類別Caaa的物件
         {
            void set_num(int n)
            {
               num=n;
               System.out.println("num= "+ num);
            }
          }
      ).set_num(5);  // 執行匿名內部類別裡所定義的method
   }

   static class Caaa
   {
       int num;
   }
}
