
public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 자동형 변환 ( 작은 바이트가 큰 바이트로 들어갈 때 변환 되는 것 )
		byte b = 10;  // = 1byte = 00001010
		short s = b;  // = 2byte = 00000000 00001010
		int i = s;    // = 4byte = 00000000 00000000 
		              //           00000000 00001010
		
		long l = i;
	    // 작은 크기의 데이터를 큰 공간에 저장할 때 발생
        float f = 0.5f;
        double d = f;      // 자동형 변환
	    f = i;  // 4byte = 4byte
	    System.out.println(f); 
	    f = l; 
	    System.out.println(); 
	    /// 실수는 정수보다 크다. 
	    // byte < short < int < long < float < double 
	    // byte는 전부에 포함가능  
	    double e =3e2; // 지수는 실수형으로만 저장할 수 있다. 
	    System.out.println(e); 
	    // int i1 = 3e2;   불가능
	    
	}

}
