package TestForApplication;

public class SunMultiplicative {
	/* �ɦW:�s�M�s�n���Ƴs�M.java
	 * ����:��J�@���n�A�íp��1+2+�K+n(�s�M)�A��1*2*�K*n(�s�n)
	 */
	public static void main(String[] args)
	{
		/*
		 *  1.Ū������i���ƭ�
		 *  2.�Ni�ƭȩM�ܼƬۥ[
		 *  3.�N�ۥ[���G�^�s���ܼ�
		 */
		int []IntArry={1,2,3,4,5,6,7,8};
		int NewTurn;
		double NewTurnMult;
		int Add;
		int result=0;
		double resultMult=1;
		int i;
		double Mult;
		int j;
		Double []DoubleArry={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		
		for(i=0;i<=IntArry.length;i++)
		{
		NewTurn=IntArry[i]; //Ū������i���ƭ�
		Add = NewTurn + result; //�Ni�ƭȩM�ܼƬۥ[
		result = Add; //�N�ۥ[���G�^�s���ܼ�
		System.out.println("��"+(i+1)+"�������G��"+result);
		}
		
		for(j=0;j<=IntArry.length;j++)
		{
		NewTurnMult=DoubleArry[j]; //Ū������i���ƭ�
		Mult = NewTurnMult * resultMult; //�Ni�ƭȩM�ܼƬۭ�
		resultMult = Mult; //�N�ۥ[���G�^�s���ܼ�
		System.out.println("��"+(j+1)+"�������G��"+resultMult);
		}
	}
}
