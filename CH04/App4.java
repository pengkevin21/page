import java.lang.*;
public class App4 { 
	public static void main(String args[]) 
	{ 	
		int a=5,b=10;
		System.out.println("AND邏輯運算子= "+(a>0 & b>0));
		System.out.println("OR邏輯運算子= "+(a>0 | b>0));
		System.out.println("AND位元運算子= "+(a & b));
		System.out.println("OR位元運算子= "+(a | b));
		System.out.println("XOR位元運算子= "+(a ^ b));
		int num = 16; 
		System.out.println("原數值: " +num);
        	System.out.println("二進位: " +Integer.toBinaryString(num));
		// 轉成二進位
        	System.out.println("八進位: " +Integer.toOctalString(num));
		// 轉成八進位
        	System.out.println("十六進位:" +Integer.toHexString(num));
		// 轉成十六進位
		
	} 
} 