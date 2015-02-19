package leanJAVA;
	/*
	 * 程式目的： 學習2維矩陣不規則陣列
	 * 程式說明：
	 */
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		 int arr[][];
		 
	        arr = new int[2][];
	        arr[0] = new int[3];
	        arr[1] = new int[5];
	 
	        // 設定陣列元素值
	        for (int i = 0; i < arr.length; i++){
	            for (int j = 0; j < arr[i].length; j++){
	                arr[i][j] = j + 1;
	            }
	        }
	 
	        // 顯示陣列元素值
	        for (int i = 0; i < arr.length; i++){
	            for (int j = 0; j < arr[i].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
