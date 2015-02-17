package leaned;
/*
 * 程式目的：學習關係運算子和條件運算子操作
 * 程式說明：
 * 			1.變數A大於變數B
 * 			2.變數A大於等於變數B
 * 			3.變數A小於變數B
 * 			4.變數A小於等於變數B
 * 			5.變數A等於變數B
 * 			6.變數A不等於變數B
 */
public class RelationshipAndConditionsOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // 宣告變數
        int j = 42;
        int i = 37;
        int k = 42;
        System.out.println("變數值...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
 
        // 大於
        System.out.println("大於...");
        System.out.println(" j > i = " + (j > i));
        System.out.println(" i > j = " + (i > j));
        System.out.println(" k > j = " + (k > j));
 
        // 大於或等於
        System.out.println("大於或等於...");
        System.out.println(" i >= j = " + (i >= j));
        System.out.println(" j >= i = " + (j >= i));
        System.out.println(" k >= j = " + (k >= j));
 
        // 小於
        System.out.println("小於...");
        System.out.println(" i < j = " + (i < j));
        System.out.println(" j < i = " + (j < i));
        System.out.println(" k < j = " + (k < j));
 
        // 小於或等於
        System.out.println("小於或等於...");
        System.out.println(" i <= j = " + (i <= j));
        System.out.println(" j <= i = " + (j <= i));
        System.out.println(" k <= j = " + (k <= j));
 
        // 等於
        System.out.println("等於...");
        System.out.println(" i == j = " + (i == j));
        System.out.println(" k == j = " + (k == j));
 
        // 不等於
        System.out.println("不等於...");
        System.out.println(" i != j = " + (i != j));
        System.out.println(" k != j = " + (k != j));
	}

}
