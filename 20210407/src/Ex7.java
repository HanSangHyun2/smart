
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          char c1 = 'A' + 1; // 65 + 1 = 66 // ������ �ʱ�ȭ �� ������ �ڷ��������̹Ƿ� A�� 2����Ʈ��  �ڿ� 1�� 2����Ʈ�� ���
          System.out.println(c1); 
          char c2 = 'A'; 
          System.out.println(c2); 
          int c3 = c2 + 1; // char�� ���� �����̶� ������ ���Ƿ� int�� ��� ��. 4byte ������ �ؾ��ϹǷ� 
                 // ���� 2byte�� ����Ϸ��� ������ �߻����� �������� (char)(c2+1);�� �Ǿ�� ��. 
          int c4 = c2 +1; 
          System.out.println(c4); 
          
          char ch1 = 65; 
          short s1 = 65 + 35; 
          short s2 = 10; 
          short s3 = 20; 
          short s4 = s2 + s3; // ���� -> (short)(s2+s3); 
          
          char ch1 = 65; 
          char ch2 = 'B' + 1; // ũ�⸸ �Ѿ�� ������ ���� 
          char ch3 = ch2 + 1; // ch2�� ���� �ִ� ���� �����ؾ� �ϹǷ� ���� ������ �� ���ۿ� ����. 
                             // char�� int�� �ٲ� �ֵ� (char)(ch2 + 1);�� �ٲٸ� �ذ��. 
          int i8 = ch2 + 1; 
          System.out.println(i8);
	}

}
