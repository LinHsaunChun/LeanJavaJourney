package leaned;
/*
 * 程式目的：學習變數宣告與字元應用
 * 程式說明：
 * 			顯示使用者的基本資料，用變數儲存下列資訊：
 * 			1.性別, 2.年齡, 3.出生年月日
 * 			然後印出來
 */
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 宣告變數
		 */

		char SexofStudent = 'M';
		int AgeofStudent = 18;
		int barnofYear = 2015;
		int barnofMouth = 2;
		int barnofDay = 15;

		/*
		 *程式操作內容 
		 */
		
		System.out.print("學生性別：");
		System.out.println(SexofStudent);
		System.out.print("學生年齡：");
		System.out.println(AgeofStudent);
		System.out.print("學生出生年月日：");
		System.out.print(barnofYear);
		System.out.print("年");
		System.out.print(barnofMouth);
		System.out.print("月");
		System.out.print(barnofDay);
		System.out.println("日");
		
		/*
		 * 階段二：把變數指派給另一個變數
		 */
		
		int age=AgeofStudent;
		System.out.print("變數AgeofStudent的值：");
		System.out.println(AgeofStudent);
		System.out.print("將變數AgeofStudent的值指派給變數age：");
		System.out.println(age);
		
	}

}
