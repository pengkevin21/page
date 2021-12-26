class thiskeyword
{
   int i=100;
   int j=100;
   void amethod()
   {
	int i=0;
	System.out.println("i= "+i);	
	System.out.println("this.i= "+ this.i);
	System.out.println("j= "+j);
	System.out.println("this.j= "+this.j);
   } 
}
public class App_thiskeyword
{
   public static void main(String args[])
   {
	thiskeyword tk=new thiskeyword();
	tk.amethod();
   }
}