package leanJAVA;
/*
 * 程式目的：
 * 使用多維陣列( Multi-dimensional arrays )來儲存矩陣值 
 * ( 陣列的陣列的陣列,依此類推)
 * 
 * 程式說明：
 * 		1.建立一維陣列,建立時必須指定陣列的長度
 * 		2.使用迴圈來反覆設定陣列中每一個元素的值
 * 		3.foreach 語法,又稱之為 Enhanced for loop,您可以將這個語法使用於陣列的循序存取
 * 		
 */
public class OneDimensionalArrays {

	public static void main(String[] args) {
		/*
		 * 建立一維陣列,建立時必須指定陣列的長度
		 */
		 int[] ages = {19, 42, 92, 33, 46};
	     char[] name = {'J', 'a', 'v', 'a'};
	        Integer[] scores = {new Integer(1),
	                new Integer(2),
	                new Integer(3)};
	 
	        System.out.println("陣列元素初值:");
	        System.out.print("ages: " + ages[0]);
	        System.out.print(" " + ages[1]);
	        System.out.print(" " + ages[2]);
	        System.out.print(" " + ages[3]);
	        System.out.println(" " + ages[4]);
	 
	        System.out.print("name: " + name[0]);
	        System.out.print(" " + name[1]);
	        System.out.print(" " + name[2]);
	        System.out.println(" " + name[3]);
	 
	        System.out.print("scores: " +
	                scores[0].intValue());
	        System.out.print(" " +
	                scores[1].intValue());
	        System.out.println(" " +
	                scores[2].intValue());
		/*
		 * 使用迴圈來反覆設定陣列中每一個元素的值
		 */
	        int[] myArray;
	        myArray = new int[10];
	        for (int count = 0;
	             count < myArray.length;
	             count++){
	            myArray[count] = count;
	        }
	 
	        System.out.print("myArray: ");
	        for (int count = 0;
	             count < myArray.length;
	             count++){
	            System.out.print(myArray[count] + " ");
	        }
	        System.out.println();

		
		/*
		 *  foreach 語法,又稱之為 Enhanced for loop,您可以將這個語法使用於陣列的循序存取
		 */
	        int[] myArray2;
	        myArray2 = new int[10];
	        for (int count = 0;
	             count < myArray2.length;
	             count++){
	            myArray2[count] = count;
	        }
	 
	        System.out.print("myArray2: ");
	        for(int element : myArray2) {
	            System.out.print(element + " ");
	        }
	        System.out.println();
	}

}
