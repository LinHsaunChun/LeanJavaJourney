package leaned;
/*
 * 程式目的：學習基本運算子使用方式
 * 程式說明：
 * 			1.兩變數相加為42
 * 			2.兩變數相減為15
 * 			3.兩變數相乘為98
 * 			4.兩變數相除為35
 * 			5.兩變數相除取餘數
 * 			6.單一變數遞增
 * 			7.單一變數遞減
 * 
 */
public class ArithmeticOperator {
	public static void main(String[] args) {
		int VarA=20;
		int VarB=22;
		/*
		 * 兩變數相加為42
		 */
		System.out.print("變數A為");
		System.out.println(VarA);
		System.out.print("變數B為");
		System.out.println(VarB);
		System.out.print("變數A加變數B為");
		System.out.println(VarA+VarB);
		/*
		 * 兩變數相減為15
		 */
		int VarC=30;
		int VarD=15;		
		System.out.print("變數C為");
		System.out.println(VarC);
		System.out.print("變數D為");
		System.out.println(VarD);
		System.out.print("變數C減變數D為");
		System.out.println(VarC-VarD);
		/*
		 * 兩變數相乘為98
		 */	
		int VarE=49;
		int VarF=2;		
		System.out.print("變數E為");
		System.out.println(VarE);
		System.out.print("變數F為");
		System.out.println(VarF);
		System.out.print("變數E減變數F為");
		System.out.println(VarE*VarF);
		/*
		 * 兩變數相除為35
		 */
		int VarG=70;
		int VarH=2;
		float Result = VarG/VarH; //暫存變數G除變數H的計算結果
		System.out.print("變數G為");
		System.out.println(VarG);
		System.out.print("變數H為");
		System.out.println(VarH);
		System.out.print("變數G除變數H為");
		System.out.println(Result);
		/*
		 * 兩變數相除取餘數
		 */
		int VarI=70;
		int VarJ=2;
		float Result_IJ = VarI%VarJ; //暫存變數G除變數H的計算結果
		System.out.print("變數I為");
		System.out.println((float)VarI); //Note:轉型直接在使用的變數名稱前面打變數形態即可ex: (float) VarI 
		System.out.print("變數J為");
		System.out.println(VarJ);
		System.out.print("變數I除變數J的餘數為");
		System.out.println(Result_IJ);
		/*
		 * 單一變數遞增
		 */
		int VarK=70;
		int addK=VarK+1;   //用數字+1達到遞增效果
		int addKup=++VarK; //用遞增符號
		System.out.print("變數K為");
		System.out.println(VarK);
		System.out.print("用數字+1達到遞增效果答案為");
		System.out.println(addK);
		System.out.print("用遞增幅號達到遞增效果答案為");
		System.out.println(addKup);		
		/*
		 * 單一變數遞減
		 */
		int VarL=70;
		int downL=VarL-1;
		int downLdown = --VarL; 
		System.out.print("變數L為");
		System.out.println(VarL);
		System.out.print("用數字+1達到遞減效果答案為");
		System.out.println(downL);
		System.out.print("用遞減幅號達到遞減效果答案為");
		System.out.println(downLdown);	
	}
}
