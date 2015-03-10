package leanJAVA;
	/*
	 * 程式目的：練習如何使用sub function
	 */

public class CallFuncation {
	/*
	 * int x=15,y=25,w,z=0;
　	 * 定義整數變數 x，y，w，z 並依序設定初值分別為 x=15,y=25,w=0,z=0。
	 *  w=Sub((z=Add(x,y)),y);
　	 * 執行到 Sub((z=Add(x,y)),y) 時，主程式會先對 z=Add(x,y) 及 y 求右值，
	 * 再呼叫函式 sub。
	 * 但此時 z=Add(x,y) 又呼叫另一函式 Add(x,y)，
	 * 將程式執行流程改變到程式 public static int Add(int i,int j)，
	 * 其中 public static int 定義了函式的傳回值，並將 x 傳入 i 中，
	 * 將 y 值傳入 j 中，z=Add(x,y)
	 * 表示會用變數 z 承接 Add()函式傳回值；
	 * 同理再把 z，y 傳入 Sub(i,j) 經運算後得出 w=15。
	 * 將 w 的結果值顯示在螢幕。
	 */
	public static void main(String[] args) 
	{
		int x=15,y=25;
		int w,z=0;
		w=Sub((z=Add(x,y)),y);
		System.out.println(w);
	}
	private static int Add(int i,int j)
	{
		int sum=0;
		sum=i+j;
		return sum;
	}
	
	private static int Sub(int i,int j)
	{
		int sum=0;
		sum=i-j;
		return sum;
	}

}
