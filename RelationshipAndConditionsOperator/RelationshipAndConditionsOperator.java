package leaned;
/*
 * ��ʽĿ�ģ��W���P�S�\���Ӻ͗l���\���Ӳ���
 * ��ʽ�f����
 * 			1.׃��A���׃��B
 * 			2.׃��A��춵��׃��B
 * 			3.׃��AС�׃��B
 * 			4.׃��AС춵��׃��B
 * 			5.׃��A���׃��B
 * 			6.׃��A�����׃��B
 */
public class RelationshipAndConditionsOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // ����׃��
        int j = 42;
        int i = 37;
        int k = 42;
        System.out.println("׃��ֵ...");
        System.out.println(" i = " + i);
        System.out.println(" j = " + j);
        System.out.println(" k = " + k);
 
        // ���
        System.out.println("���...");
        System.out.println(" j > i = " + (j > i));
        System.out.println(" i > j = " + (i > j));
        System.out.println(" k > j = " + (k > j));
 
        // ��춻���
        System.out.println("��춻���...");
        System.out.println(" i >= j = " + (i >= j));
        System.out.println(" j >= i = " + (j >= i));
        System.out.println(" k >= j = " + (k >= j));
 
        // С�
        System.out.println("С�...");
        System.out.println(" i < j = " + (i < j));
        System.out.println(" j < i = " + (j < i));
        System.out.println(" k < j = " + (k < j));
 
        // С춻���
        System.out.println("С춻���...");
        System.out.println(" i <= j = " + (i <= j));
        System.out.println(" j <= i = " + (j <= i));
        System.out.println(" k <= j = " + (k <= j));
 
        // ���
        System.out.println("���...");
        System.out.println(" i == j = " + (i == j));
        System.out.println(" k == j = " + (k == j));
 
        // �����
        System.out.println("�����...");
        System.out.println(" i != j = " + (i != j));
        System.out.println(" k != j = " + (k != j));
	}

}
