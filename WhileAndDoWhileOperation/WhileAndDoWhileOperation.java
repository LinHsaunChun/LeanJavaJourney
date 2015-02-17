package leaned;
/*
 * 程式目的：學習如何使用while函數和do while函數
 * 程式說明：
 * 			1.用*字符產生M乘N的矩陣，用邏輯前測
 * 			2.用*字符產生M乘N的矩陣，用先執行後判斷的方式
 */
public class WhileAndDoWhileOperation {

	public static void main(String[] args) {
		/*
		 * 使用while函數進行邏輯前測產生M*N的矩陣
		 */
		// TODO Auto-generated method stub
		/*
		 * 讀取使用者輸入的矩陣長度M
		 */
		java.util.Scanner VarM = new
				java.util.Scanner(System.in);
		System.out.println("請輸入矩陣長度");
		int InputVarM = VarM.nextInt();
		System.out.print("輸入的矩陣長度為");
		System.out.println(InputVarM);
		/*
		 * 讀取使用者輸入的矩陣寬度N
		 */
		java.util.Scanner VarN = new
				java.util.Scanner(System.in);
		System.out.println("請輸入矩陣寬度");
		int InputVarN = VarN.nextInt();
		System.out.print("輸入的矩陣寬度為");
		System.out.println(InputVarN);
		/*
		 * 計算目前畫出的矩陣長度與寬度
		 */
		int VarMCount=0;
		int VarNCount=0;
		System.out.println("現在開始繪製圖形");
		while(VarNCount<=InputVarN){
			
			/*
			 * 每畫出M個*就換行
			 */
			while(VarMCount<=InputVarM){
				System.out.print("*");
				VarMCount=++VarMCount;
			}
			/*
			 * 執行N次換行就結束
			 */
			System.out.println("");
			VarNCount=++VarNCount;
			/*
			 * 重新計算畫出*的數量
			 */
			VarMCount=0;
		}
	}

}
