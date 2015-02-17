package leaned;
/*
 * 程式目的：學習如何取得使用者輸入
 * 程式說明：
 * 			運用JAVA內建java.util.Scanner取得使用者輸入訊息
 * 			1.將使用者輸入的訊息用int形式取得
 * 			2.將使用者輸入的訊息用flot形式取得
 * 			3.將使用者輸入的訊息用Boolean形式取得
 * 
 */
public class GetUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//使用Scanner工具掃描變數UserInput
		//@SuppressWarnings("resource")
		java.util.Scanner UserInputData = new
	                java.util.Scanner(System.in);
		//將使用者輸入的資訊以整數形態接受
	        System.out.print("輸入整數:");
	        int IntInput = UserInputData.nextInt();
	    //將使用者輸入的資訊以浮點數形態接受
	        System.out.print("輸入浮點數:");
	        double FloatInput = UserInputData.nextDouble();
	    //將使用者輸入的資訊以布林數形態接受
	        System.out.print("輸入布林數:");
	        boolean BooleanInput= UserInputData.nextBoolean();
	 
	        System.out.println("整數輸入:" + IntInput);
	        System.out.println("浮點數輸入:" + FloatInput);
	        System.out.println("布林數輸入:" + BooleanInput);
	}

}
