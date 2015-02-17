package leaned;
/*
 * 程式目的：學習資料格式
 * 程式說明：
 * 			1.輸出數值
 * 			2.輸入超過int範圍的數值觀看錯誤訊息
 * 			3.將數值內容改以long變數形態儲存
 * 			4.儲存小數點以測試double和float
 */
public class datatype {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//輸入int變數範圍內數值。
		System.out.println(5);
		
		/*
		 * 輸入int變數範圍外數值，會出現錯誤報告。
		 * 測試完請將程式碼註解，否則程式會一值出現錯誤導致編譯不下去
		 */
		
//		System.out.println(123456789123);

		//在數值後面加上"L"，代表改以long資料形態儲存。
		System.out.println(123456789123L);
		//儲存小數點，弱儲存空間不夠可改以double和float儲存
		System.out.println(0.9999999);
		
	}
}
