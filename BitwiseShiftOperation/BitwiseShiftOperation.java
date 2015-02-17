package leaned;
/*
 * 程式目的：練習 位元運算子、位移運算子運用
 * 程式說明：
 * 			1.兩變數執行and (&)
 * 			2.兩變數執行or (|)
 * 			3.兩變數執行 Exclusive or) (^)
 * 			4.單一變數執行補數
 * 
 */
public class BitwiseShiftOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 13;
        int j = 12;
 
        System.out.println("變數值...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
 
        System.out.println("位元運算...");
        //兩變數執行and (&)
        System.out.println(" i & j = " + (i & j));
        //兩變數執行or (|)
        System.out.println(" i & j = " + (i | j));
        //兩變數執行 Exclusive or) (^)
        System.out.println(" i & j = " + (i ^ j));
        //單一變數執行補數
        System.out.println(" ~i = " + (~i));
	}

}
