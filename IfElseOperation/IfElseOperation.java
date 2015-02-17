package leaned;
/*
 * 祘Αヘ厩策眔ㄏノ块
 * 祘Α弧
 * 			笲ノJAVAずjava.util.Scanner眔ㄏノ块癟
 * 			1.狦ㄏノ块计玥セ计k+1
 * 			2.狦ㄏノ块蛮计玥セ计k
 * 			3.狦ㄏノ块琌块玥肚癟"计"ぃ琌计玥肚案计
 
 */
public class IfElseOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		java.util.Scanner UserInput = new
		java.util.Scanner(System.in);
		/*
		 * 狦ㄏノ块计玥セ计k
		 */
		System.out.println("叫块计");
		int number = UserInput.nextInt(); //跑计number穦眖UserInput眔篈Int计
		if (number%2 ==1)
			number=number+k;
		System.out.println(number+"琌计");
		/*
		 * 狦ㄏノ块案计玥セ计k+1
		 */
		System.out.println("叫块案计");
		int DoubleNum = UserInput.nextInt();
		if (DoubleNum%2 ==0)
			DoubleNum=DoubleNum+k;
		System.out.println(DoubleNum+"琌案计");
		/*
		 * 狦ㄏノ块琌块玥肚癟"计"ぃ琌计玥肚案计
		 */
		java.util.Scanner UserData = new
			java.util.Scanner(System.in);
		System.out.println("叫块计");
		int UseNumber= UserData.nextInt();
		if(UseNumber%2==1)
			System.out.println("块计琌计");
		else
			System.out.println("块计琌案计");
		
	}

}
