package leaned;
/*
 * 程式目的：學習如何使用Switch函數
 * 程式說明：
 * 			輸入一個學生的成績，90以上得A，80分以上得B，70分以上得C，60分以上的D,未滿60分得F
 */
public class SwitchOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner Point = new
				java.util.Scanner(System.in);

		System.out.println("請輸入學生分數");
		int StudentPoint = Point.nextInt();
		System.out.print("學生分數為");
		System.out.print(StudentPoint);
		System.out.println("分");
		int level = StudentPoint/10;
		switch (level){
			case 10:
			System.out.println("學生成績為A");
			break;
			case 9:
			System.out.println("學生成績為A");
			break;			
			case 8:
			System.out.println("學生成績為C");
			break;			
			case 7:
			System.out.println("學生成績為D");
			break;			
			case 6:
			System.out.println("學生成績為E");
			break;
			default:
			System.out.println("學生成績為F");
		}
	}

}
