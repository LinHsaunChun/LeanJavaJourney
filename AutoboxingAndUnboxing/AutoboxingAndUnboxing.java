package leaned;
/*
 * 程式目的：學習Autoboxing和Unboxing差異
 * 程式說明：Autoboxing
 */
public class AutoboxingAndUnboxing 
{

	public static void main(String[] args)
	{
		/*
		 * 階段一:沒有將參數先包裝，就進行比較
		 * 結果解釋:第 3 行與第 4 行修改為指定值為 200,其餘部份並沒有改變,卻造成了不同的執行結果
		 * 其實這邊涉及到關係運算子"=="用於參考名稱的比較問題。
		 *當關係運算子"=="使用於兩個參考名稱之比較時,它比較的是兩個參考名稱是否參考至同一個物件,
		 * 以程式碼 8-2 或8-3 為例,就是在比較 iRef1 與 iRef2 是否繫結至同一個物件。
		 * 自動裝箱機制對於整數值 -128 到 127 之間的值,在裝箱為物件之後,會存在記憶體之中一直被重複使用,
		 * 而對於-128 到 127 之外的值,則於執行時期運行到該段程式碼時,才建立一個新的物件。
		 */

		/*
		 * 如果要執行下區程式請把註解拿掉
		 */
	//	 Integer iRef1 = 100;
	//        Integer iRef2 = 100;
	 
	//        if (iRef1 == iRef2) {
	//            System.out.println("iRef1 == iRef2");
	//        }
	//        else {
	//            System.out.println("iRef1 != iRef2");
	//        }
	
		Integer iRef1 = 200;
		Integer iRef2 = 200;

		if (iRef1 == iRef2)
		{
         System.out.println("iRef1 == iRef2");
		}
		else 
		{
         System.out.println("iRef1 != iRef2");
		}
	}
}


