
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ڵ��� ��ȯ ( ���� ����Ʈ�� ū ����Ʈ�� �� �� ��ȯ �Ǵ� �� )
		byte b = 10;  // = 1byte = 00001010
		short s = b;  // = 2byte = 00000000 00001010
		int i = s;    // = 4byte = 00000000 00000000 
		              //           00000000 00001010
		
		long l = i;
	    // ���� ũ���� �����͸� ū ������ ������ �� �߻�
        float f = 0.5f;
        double d = f;      // �ڵ��� ��ȯ
	    f = i;  // 4byte = 4byte
	    System.out.println(f); 
	    f = l; 
	    System.out.println(); 
	    /// �Ǽ��� �������� ũ��. 
	    // byte < short < int < long < float < double 
	    // byte�� ���ο� ���԰���  
	    double e =3e2; // ������ �Ǽ������θ� ������ �� �ִ�. 
	    System.out.println(e); 
	    // int i1 = 3e2;   �Ұ���
	    
	}

}
