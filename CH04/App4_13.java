import java.io.*; 
public class App4_13{ 
public static void main(String args[]) throws IOException 
{ 
int n, i; 
BufferedReader buf; 
buf = new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("�п�J��1�������:");
n = Integer.parseInt(buf.readLine()); 
for(i = n/2; i > 1; i--) // �ˬd��n/2(��n�}�ڸ�)�Y�i
if(n % i == 0) 
break; 
if(i != 1) 
System.out.println(n + " �������"); 
else 
System.out.println(n + " �����"); 
} 
} 

