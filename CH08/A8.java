class GuessNumClass {
	private final byte guessNumAns = (byte) ((Math.random() * 100) + 1);

	private byte guessNumLeft ;

	private byte guessNumRight;

	private byte guessCount;
	
	public GuessNumClass(byte left,byte right, byte count){
		guessNumLeft=left;
		guessNumRight=right;
		guessCount=count;
	
	}
	
	void guessNumMethod(byte i) {
		guessCount += 1;
		if (i < guessNumAns) {
			guessNumLeft = i;
			System.out.println("��" + guessCount + "���A�Ӥp�A���� " + guessNumLeft
					+ "~" + guessNumRight +" ���׬� : "+guessNumAns);
			return ;
		} else if (i > guessNumAns) {
			guessNumRight = i;
			System.out.println("��" + guessCount + "���A�Ӥj�A���� " + guessNumLeft
					+ "~" + guessNumRight +" ���׬� : "+guessNumAns);
			return;
		} else {
			System.out.println("��" + guessCount + "���A�q��F�A����  " + guessNumAns);
			return ;
		}
	}
}

public class A8
{
	public static void main(String A[])
	{
		GuessNumClass A1=new GuessNumClass((byte)50,(byte)100,(byte)10);
		A1.guessNumMethod((byte)50);
		GuessNumClass A2=new GuessNumClass((byte)39,(byte)99,(byte)98);
		A2.guessNumMethod((byte)60);
	}
}