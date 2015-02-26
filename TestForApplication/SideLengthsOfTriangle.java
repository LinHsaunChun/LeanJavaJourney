package TestForApplication;

public class SideLengthsOfTriangle {

	public static void main(String[] args) {
		// 命令列輸入三個整數，判斷此三個整數是否能成為三角形的三個邊的長度
		
		int[] InputArry={1,2,1};
		int Test = 4;
		
		if(InputArry[0]+InputArry[1]>InputArry[2] & InputArry[2]+InputArry[0]>InputArry[1] &InputArry[1]+InputArry[2]>InputArry[0])
		{
			System.out.print("可以構成三角形");
		}
		else
		{
			System.out.print("不可以構成三角形");
		}
	}

}
