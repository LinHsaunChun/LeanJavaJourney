package TestForApplication;

public class NumberOfDaysPreMonth {

	public static void main(String[] args)
	{
		int i;
		int [] DaysArry = 
			{31,29,31,30,31,30,31,31,30,31,30,31}; //�]�w�C��Ѽ�
		for(i=0;i<=11;i++)
		{
			System.out.print(i+1);                // ��ܷ�e���
			System.out.print("������ѼƦ�");
			System.out.print(DaysArry[i]);        // ��ܲ�i�ӯx�}���m��T
			System.out.println("��");
		}
		
	}

}
