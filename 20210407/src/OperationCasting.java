
public class OperationCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          short s = 10; //                    00000000 00001010 
          int i = 65537; // 00000000 00000001 00000000 00001010 
          int i1 = s + i; // 2byte + 4byte ( ���� �ٸ� ũ��� ����Ұ��� -> ����ȯ�� �ʿ� 2byte�� 4byte ) 
                          // 4byte + 4byte (�ڵ� ����ȯ) 
                          // 00000000 00000000 00000000 00001010 
                          // 00000000 00000001 00000000 00000001
         /// ����Ŀ����� �ڵ� ����ȯ�̶�� ��.
          System.out.println(i1);
		  int i2 = 10; 
          double d = 170.5; 
          double d1 = i2 + d; // i2 (4byte) + d = (8byte) 
                              // 8byte (�Ǽ��� ��ȯ) + 8byte
          System.out.println(d1); 
          
          // ������ 4byte�� ����
          System.out.println(10 + 20);
          
          byte b = 10; 
          byte b1 = 20;
          byte b2 = (b + b1); // 1byte + 1byte (x)
                            // 4byte + 4byte 
                            // 1111111
          byte b3 = 127;    // 01111111
          byte b4 = 2;     // 00000010
                            // 1(��ȣ��Ʈ)0000001 : -127 (129�� ���;� �ϴµ� ����Ʈ �� ����Ʈ �����̶� ���� �ٸ��� ����) 
          // 00000000 00000000 00000000 01111111 
          // 00000000 00000000 00000000 00000010 
          // 00000000 00000000 00000000 10000001
          
          System.out.println(b2);
	      short s1 = 10; 
	      short s2 = 20; // 2byte + 2byte = ������ ���� �� �����ϱ� => 4byte + 4byte�� ��ȯ
	      int i3 = s1 + s2; 
	      
	      float f1 = 10.f; 
	      float f2 = 20.5f; 
	      float d2 = f1 + f2;  // 4byte�� ����
	      System.out.println(d2);    
	      double d3 = f1 + 100.5; // 4byte + 8byte 
	                       // 8byte + 8byte 
	      System.out.println(d3);
          int x, y, z; 
	    
	}

}
//// 2�� 
/// ����ȯ : �ڵ�����ȯ  :    ū �ڷ��� = ���� �ڷ��� (���� �ڷ����� ū �ڷ����� ���� ��)
///           ��������ȯ :   ���� �ڷ��� = (���� �ڷ���) ū �ڷ��� 
///           ����� �ڵ��� ��ȯ : ������ �ڷ����� ū�ڷ����� ������ �� �� ���� �ڷ����� ū �ڷ������� ��ȯ 