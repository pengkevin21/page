import java.io.*;
public class app4_ex{
	public static void main(String args[])throws IOException{
	int num1,num2,and,or,xor;
	BufferedReader buf;
	String str1,str2,str3;
	int a;
	
	
	buf = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("�п�J�ƭ�1 :");
	str1 = buf.readLine();
	System.out.print("�п�J�ƭ�2 :");
	str2 = buf.readLine();
	num1 = Integer.parseInt(str1);
	num2 = Integer.parseInt(str2);
	str3=Integer.toBinaryString(num1);
	a =  Integer.parseInt(str3);
	
	System.out.println("2�i�� ;" + Integer.toBinaryString(num1));
	System.out.println("8�i�� ;" + Integer.toOctalString(num1));
	System.out.println("16�i�� ;" + Integer.toHexString(num1));
	System.out.println("2�i�� ;" + Integer.toBinaryString(num2));
	System.out.println("8�i�� ;" + Integer.toOctalString(num2));
	System.out.println("16�i�� ;" + Integer.toHexString(num2));
	and = num1&num2;
	or = num1|num2;
	xor = num1^num2;
	System.out.println("AND ;" + Integer.toBinaryString(and));
	System.out.println("OR ;" + Integer.toBinaryString(or));
	System.out.println("XOR ;" + Integer.toBinaryString(xor));
	System.out.println("and�ɼ� ;" + (~num1));
	System.out.println("num1 >> 1 :" + (a>>1));
	System.out.println(a);
	
	}
}