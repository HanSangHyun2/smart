
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = -127;  
        int resultl = -1; 
        System.out.println(resultl); 
        int result1 = + i;   // +(-127) : -127 
        System.out.println(result1); 
        int a = 10; 
        int b = 3; 
        int result2 = a + b; 
        System.out.println(result2);
        result2 = a - b;  //  
        System.out.println(result2); 
        result2 = a * b;  //  30
        System.out.println(result2); 
        result2 = a / b;   // 3
        System.out.println(result2); 
        result2 = a % b;  // 1
        System.out.println(result2); 
        short s = -10; // -(-10) // -s 
        int s1 = -s; // ���������� ������ 4byte�̴�. 
        
        int j = 10; 
        int k = 20; 
        
        double result3 = j / k; // ���� ���� 0.5�ε�, ������ ���� ������ �������� ���ͼ� 0.0�� ����� ������.
                                // (double)j / k;  �ڵ���ȯ�̹Ƿ� j���� double�� �ٿ��� k�� ��ȯ�ȴ�.
        System.out.println(result3); 
        
        
	}

}
