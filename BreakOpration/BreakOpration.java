package leaned;
/*
 * 程式目的：練習Break操作
 * 程式說明：計算成績平均的程式,使用 while 迴圈來執行接受使用者的輸入,當輸入為-1 時終止迴圈並計算結果。
 */

public class BreakOpration {

	public static void main(String[] args) {
		/*
		 * 取得使用者輸入的ScoreInput變數值
		 */
		java.util.Scanner ScoreInput = new
				java.util.Scanner(System.in);
		int sum=0;
		int count=0;
		while(true)
		{
		System.out.println("請輸入分數，如果輸入-1將離開程式");
		int score = ScoreInput.nextInt();
		System.out.print("您輸入的分數為");
		System.out.print(score);

			if(score == -1)
			{
				System.out.println("因為您輸入-1，即將結束程式");
				break;
			}
			sum = sum+score;
			System.out.print("目前分數總和為");
			System.out.println(sum);
			count=count+1;//計算目前有多少數值被輸入
		}
		System.out.print("分數平均總合");
		System.out.println((float)sum/(float)count);
	}

}
