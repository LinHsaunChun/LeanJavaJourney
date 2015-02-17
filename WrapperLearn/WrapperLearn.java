package leaned;
/*
 * 程式目的：練習Wrapper操作
 * 程式說明：將使用者輸入的數值int class包裝成物件形式，然後比較兩個變數的大小
 */
public class WrapperLearn {

	public static void main(String[] args) {
	
		/*
		 *  Phase 1: 測試，將使用者輸入數值包裝成物件
		 */
		/*
		 *  Step1:接收使用者輸入的數值
		 */
	//		java.util.Scanner UserInput = new
	//				java.util.Scanner(System.in);
	//		System.out.println("請輸入一個整數");
	//		int Input = UserInput.nextInt();
	//		System.out.print("你輸入的數值為");
	//		System.out.println(Input);
		/*
		 *  Step2:將數值包裝成物件
		 */
	//		Integer UserInputData = new Integer(Input);
		/*
		 *  Stpe3:印出包裝好物件的值
		 */
	//		System.out.print("包裝好物件型式數值為");
	//		System.out.println(UserInputData);
	
		/*
		 *  Phase 2: 以物件型式比較學生年齡和體重的數值大小
		 */
			java.util.Scanner AgeofStudentInput = new
					java.util.Scanner(System.in);
			System.out.println("請輸入學生年齡");
			int AgeofStudent = AgeofStudentInput.nextInt();
			Integer ObjectTypeAgeofStudent = new Integer(AgeofStudent);
			java.util.Scanner WeightofStudentInput = new
					java.util.Scanner(System.in);
			System.out.println("請輸入學生體重");
			int WeightofStudent = WeightofStudentInput.nextInt();
			Integer ObjectTypeWeightofStudent = new Integer(WeightofStudent);
			int CompareReult=
					ObjectTypeAgeofStudent.compareTo(ObjectTypeWeightofStudent);
			
			switch(CompareReult)
			{
			case 1:
				System.out.print("學生年齡");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("大於");
				System.out.print("學生體重");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			
			case -1:
				System.out.print("學生年齡");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("小於");
				System.out.print("學生體重");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			
			case 0:
				System.out.print("學生年齡");
				System.out.print(ObjectTypeAgeofStudent);
				System.out.print("等於");
				System.out.print("學生體重");
				System.out.println(ObjectTypeWeightofStudent);
				break;
			}
    }
}

