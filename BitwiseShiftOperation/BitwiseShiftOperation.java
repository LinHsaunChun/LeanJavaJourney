package leaned;
/*
 * �{���ت��G�m�� �줸�B��l�B�첾�B��l�B��
 * �{�������G
 * 			1.���ܼư���and (&)
 * 			2.���ܼư���or (|)
 * 			3.���ܼư��� Exclusive or) (^)
 * 			4.��@�ܼư���ɼ�
 * 
 */
public class BitwiseShiftOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 13;
        int j = 12;
 
        System.out.println("�ܼƭ�...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
 
        System.out.println("�줸�B��...");
        //���ܼư���and (&)
        System.out.println(" i & j = " + (i & j));
        //���ܼư���or (|)
        System.out.println(" i & j = " + (i | j));
        //���ܼư��� Exclusive or) (^)
        System.out.println(" i & j = " + (i ^ j));
        //��@�ܼư���ɼ�
        System.out.println(" ~i = " + (~i));
	}

}
