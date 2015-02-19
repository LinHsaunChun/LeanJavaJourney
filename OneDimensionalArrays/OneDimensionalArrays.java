package leanJAVA;
/*
 * �{���ت��G
 * �ϥΦh���}�C( Multi-dimensional arrays )���x�s�x�}�� 
 * ( �}�C���}�C���}�C,�̦�����)
 * 
 * �{�������G
 * 		1.�إߤ@���}�C,�إ߮ɥ������w�}�C������
 * 		2.�ϥΰj��Ӥ��г]�w�}�C���C�@�Ӥ�������
 * 		3.foreach �y�k,�S�٤��� Enhanced for loop,�z�i�H�N�o�ӻy�k�ϥΩ�}�C���`�Ǧs��
 * 		
 */
public class OneDimensionalArrays {

	public static void main(String[] args) {
		/*
		 * �إߤ@���}�C,�إ߮ɥ������w�}�C������
		 */
		 int[] ages = {19, 42, 92, 33, 46};
	     char[] name = {'J', 'a', 'v', 'a'};
	        Integer[] scores = {new Integer(1),
	                new Integer(2),
	                new Integer(3)};
	 
	        System.out.println("�}�C�������:");
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
		 * �ϥΰj��Ӥ��г]�w�}�C���C�@�Ӥ�������
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
		 *  foreach �y�k,�S�٤��� Enhanced for loop,�z�i�H�N�o�ӻy�k�ϥΩ�}�C���`�Ǧs��
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
