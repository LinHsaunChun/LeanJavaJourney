package leanJAVA;
	/*
	 * �{���ت��G �ǲ�2���x�}���W�h�}�C
	 * �{�������G
	 */
public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		 int arr[][];
		 
	        arr = new int[2][];
	        arr[0] = new int[3];
	        arr[1] = new int[5];
	 
	        // �]�w�}�C������
	        for (int i = 0; i < arr.length; i++){
	            for (int j = 0; j < arr[i].length; j++){
	                arr[i][j] = j + 1;
	            }
	        }
	 
	        // ��ܰ}�C������
	        for (int i = 0; i < arr.length; i++){
	            for (int j = 0; j < arr[i].length; j++){
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	}

}
