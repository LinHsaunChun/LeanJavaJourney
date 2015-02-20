package TestForApplication;

public class PrintStarst {

	public static void main(String[] args) {
		//印出十二行星號
		int i=1; //設定進出行數，行數為i+1
		int j=4;  //設定進出星號數
		int count;
		int countrow;
		for(countrow=0;countrow<=i;countrow++)
		{
			for(count=0;count<=j;count++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
