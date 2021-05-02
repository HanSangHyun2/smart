
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
        int s1 = -s; // 정수연산은 무조건 4byte이다. 
        
        int j = 10; 
        int k = 20; 
        
        double result3 = j / k; // 나눈 값은 0.5인데, 정수대 정수 연산은 정수값만 나와서 0.0의 결과가 나왔음.
                                // (double)j / k;  자동변환이므로 j에만 double를 붙여도 k도 변환된다.
        System.out.println(result3); 
        
        
	}

}
