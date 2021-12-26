import java.io.*;

class GuessNumClass {
	private final byte guessNumAns = (byte) ((Math.random() * 100) + 1);

	private byte guessNumLeft = 0;

	private byte guessNumRight = 100;

	private byte guessCount = 0;
	
	boolean guessNumMethod(byte i) {
		guessCount += 1;
		if (i < guessNumAns) {
			guessNumLeft = i;
			System.out.println("第" + guessCount + "次，太小，介於 " + guessNumLeft
					+ "~" + guessNumRight);
			return false;
		} else if (i > guessNumAns) {
			guessNumRight = i;
			System.out.println("第" + guessCount + "次，太大，介於 " + guessNumLeft
					+ "~" + guessNumRight);
			return false;
		} else {
			System.out.println("第" + guessCount + "次，猜對了，答案  " + guessNumAns);
			return true;
		}
	}
}

public class GNum {

	public static void main(String[] args) throws IOException {

		GuessNumClass gNC1 = new GuessNumClass();
		byte by;
		String str;
		BufferedReader buf;
		do {
			buf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("請輸入數字1到100 ： ");
			str = buf.readLine();
			by = Byte.parseByte(str);			
		} while (!gNC1.guessNumMethod(by));
		
	}
}
