import java.lang.*;
public class App4 { 
	public static void main(String args[]) 
	{ 	
		int a=5,b=10;
		System.out.println("AND�޿�B��l= "+(a>0 & b>0));
		System.out.println("OR�޿�B��l= "+(a>0 | b>0));
		System.out.println("AND�줸�B��l= "+(a & b));
		System.out.println("OR�줸�B��l= "+(a | b));
		System.out.println("XOR�줸�B��l= "+(a ^ b));
		int num = 16; 
		System.out.println("��ƭ�: " +num);
        	System.out.println("�G�i��: " +Integer.toBinaryString(num));
		// �ন�G�i��
        	System.out.println("�K�i��: " +Integer.toOctalString(num));
		// �ন�K�i��
        	System.out.println("�Q���i��:" +Integer.toHexString(num));
		// �ন�Q���i��
		
	} 
} 