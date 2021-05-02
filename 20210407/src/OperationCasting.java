
public class OperationCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          short s = 10; //                    00000000 00001010 
          int i = 65537; // 00000000 00000001 00000000 00001010 
          int i1 = s + i; // 2byte + 4byte ( 서로 다른 크기는 연산불가능 -> 형변환이 필요 2byte가 4byte ) 
                          // 4byte + 4byte (자동 형변환) 
                          // 00000000 00000000 00000000 00001010 
                          // 00000000 00000001 00000000 00000001
         /// 연산식에서의 자동 형변환이라고 함.
          System.out.println(i1);
		  int i2 = 10; 
          double d = 170.5; 
          double d1 = i2 + d; // i2 (4byte) + d = (8byte) 
                              // 8byte (실수로 변환) + 8byte
          System.out.println(d1); 
          
          // 정수는 4byte로 연산
          System.out.println(10 + 20);
          
          byte b = 10; 
          byte b1 = 20;
          byte b2 = (b + b1); // 1byte + 1byte (x)
                            // 4byte + 4byte 
                            // 1111111
          byte b3 = 127;    // 01111111
          byte b4 = 2;     // 00000010
                            // 1(부호비트)0000001 : -127 (129가 나와야 하는데 바이트 대 바이트 연산이라 값이 다르게 나옴) 
          // 00000000 00000000 00000000 01111111 
          // 00000000 00000000 00000000 00000010 
          // 00000000 00000000 00000000 10000001
          
          System.out.println(b2);
	      short s1 = 10; 
	      short s2 = 20; // 2byte + 2byte = 음수를 가질 수 있으니까 => 4byte + 4byte로 변환
	      int i3 = s1 + s2; 
	      
	      float f1 = 10.f; 
	      float f2 = 20.5f; 
	      float d2 = f1 + f2;  // 4byte라 정상
	      System.out.println(d2);    
	      double d3 = f1 + 100.5; // 4byte + 8byte 
	                       // 8byte + 8byte 
	      System.out.println(d3);
          int x, y, z; 
	    
	}

}
//// 2장 
/// 형변환 : 자동형변환  :    큰 자료형 = 작은 자료형 (작은 자료형이 큰 자료형에 담기는 것)
///           강제형변환 :   작은 자료형 = (작은 자료형) 큰 자료형 
///           연산식 자동형 변환 : 작은형 자료형과 큰자료형이 연산을 할 때 작은 자료형이 큰 자료형으로 변환 