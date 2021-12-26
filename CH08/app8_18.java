// app8_18, 在建構元裡建立內部類別的物件
public class app8_18
{
   public app8_18()
   {
      Caaa aa= new Caaa();
      aa.set_num(5);
   }
   
   public static void main(String args[])
   {  
      app8_18 obj=new app8_18(); // 呼叫建構元app8_18()建立外部類別的物件
   }
   
   class Caaa
   {
      int num;
      void set_num(int n){
         num=n;
         System.out.println("num= "+ num); 
      }
   }   
}
