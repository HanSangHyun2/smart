
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i = 10;  // 변수명의 첫 글자는 대문자가 오면 안 됨. ( 클래스명과의 구별을 위해 ) 
         int i1 = 3; 
         int result = i % i1; // 나머지 연산자
         System.out.println(result);
         
         i = 10; 
         i1 = 20; 
         double d = i / i1; //   0.0 
         System.out.println(d); 
         d = (double) i / i1; // 8byte(실수) / 8byte(실수) 
         System.out.println(d); // 0.5 
         
         byte b1 = 127; 
         byte b2 = 2; 
         // byte b3 = b1 + b2; // 오류 1byte = 4byte + 4byte 
         int result1 = b1 + b2; // 4byte = 4byte + 4byte : 129 
         byte b3 = (byte)(b1 + b2); 
         System.out.println(b3); // -127 : 오버플로우 발생 
         
         i = 2000000000; 
         i1 = 2000000000; 
         result1 = i + i1;  // 오버플로우
         System.out.println(result1); 
         long l = (long)i + (long) i1; 
         System.out.println(l);
	
	     char ch1 = 'A' + 1;  // 리터널 값을 저장하겠다는 것
	     // 변수에 리터널 값을 저장할 경우 크기를 벗어나지 않으면 오류가 나지 않음. 
	     char ch2 = 'A'; 
	     char ch3 = ch2 + 1;  // 변수 안에 있는 값을 연산하여 (4바이트로변환)저장하겠다는 것 
	     //                     ( 2byte = 4byte + 4byte ) 
	     int i2 = ch2 +1; 
	     System.out.println(i2); 
	     char ch3 = (char)(ch2 +1); 
	     System.out.println(ch3); 
	     
	     short s1 = -10; 
	     short s2 = 10; 
	     System.out.println(-s1); //10 
	     short s3 = -s1; // 2byte = -4byte 
	     int result2 = -s1; // 4byte = -4byte 
	     System.out.println(result2); 
	     
	     // byte b4 = 127 + 2; 
	     // 리터널 값을 저장할 경우 크기를 넘으면 안됨 
	     char ch5 = 'A' + 5; 
	     System.out.println(ch5); 
	     char ch6 = 'D'; 
	     int i6 = ch6; 
	     System.out.println(i6);
	     char ch7 = (char)(ch6 + 10); 
	     System.out.println(ch7);
	
	     byte b4 = (byte)(b1+b2); // (2바이트)(4바이트 + 4바이트) // 연산 후 형변환
	     long i5 = (long)i + (long)i1; // 4바이트 + 4바이트 (-294967296)
	     System.out.println(result1); 
	     // 2000000000 + 2000000000 = 4000000000(8byte) 
	     i5 = (long)i + i1; // 8바이트 = 8바이트 + 8바이트  // 형변환 후 연산
	     System.out.println(i5);
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}
	

}
