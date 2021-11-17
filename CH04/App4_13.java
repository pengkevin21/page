import java.io.*; 
public class App4_13{ 
public static void main(String args[]) throws IOException 
{ 
int n, i; 
BufferedReader buf; 
buf = new BufferedReader(new InputStreamReader(System.in)); 
System.out.print("請輸入於1的正整數:");
n = Integer.parseInt(buf.readLine()); 
for(i = n/2; i > 1; i--) // 檢查至n/2(或n開根號)即可
if(n % i == 0) 
break; 
if(i != 1) 
System.out.println(n + " 不為質數"); 
else 
System.out.println(n + " 為質數"); 
} 
} 

