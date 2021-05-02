
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          char c1 = 'A' + 1; // 65 + 1 = 66 // 데이터 초기화 할 때에는 자료형연산이므로 A가 2바이트면  뒤에 1도 2바이트로 계산
          System.out.println(c1); 
          char c2 = 'A'; 
          System.out.println(c2); 
          int c3 = c2 + 1; // char을 쓰면 대입이라서 오류가 나므로 int로 써야 함. 4byte 연산을 해야하므로 
                 // 굳이 2byte로 계산하려면 문제가 발생하지 않으려면 (char)(c2+1);이 되어야 함. 
          int c4 = c2 +1; 
          System.out.println(c4); 
          
          char ch1 = 65; 
          short s1 = 65 + 35; 
          short s2 = 10; 
          short s3 = 20; 
          short s4 = s2 + s3; // 오류 -> (short)(s2+s3); 
          
          char ch1 = 65; 
          char ch2 = 'B' + 1; // 크기만 넘어서지 않으면 들어간다 
          char ch3 = ch2 + 1; // ch2가 갖고 있는 값과 연산해야 하므로 정수 연산이 될 수밖에 없다. 
                             // char을 int로 바꿔 주든 (char)(ch2 + 1);로 바꾸면 해결됨. 
          int i8 = ch2 + 1; 
          System.out.println(i8);
	}

}
