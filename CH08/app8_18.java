// app8_18, �b�غc���̫إߤ������O������
public class app8_18
{
   public app8_18()
   {
      Caaa aa= new Caaa();
      aa.set_num(5);
   }
   
   public static void main(String args[])
   {  
      app8_18 obj=new app8_18(); // �I�s�غc��app8_18()�إߥ~�����O������
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
