package Java_web01;

public class CharTest {
	public static void main(String[] args) {
		
		char ch1 = 'a';
		char ch2 = '가';
		//char ch3 = 'ab';  >> 문자형 변수는 한 개의 문자만 저장함.
	   	
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println((int)ch1); // int 를 이용해서 'a'를 정수로 변환 후 'a'에 대한 유니코드를 출력
		System.out.println((int)ch2);
		
		char ch01 = 'h';
		char ch02 = 'e';
		char ch03 = 'l';
		char ch04 = 'l';
		char ch05 = 'o';
		
		System.out.print(ch01);
		System.out.print(ch02);
		System.out.print(ch03);
		System.out.print(ch04);
		System.out.println(ch05);
		
		
		System.out.print(ch01 -32);
		System.out.print(ch02 -32);
		System.out.print(ch03 -32);
		System.out.print(ch04 -32);
		System.out.println(ch05 -32);
		
		System.out.print((char)(ch01 -32));
		System.out.print((char)(ch02 -32));
		System.out.print((char)(ch03 -32));
		System.out.print((char)(ch04 -32));
		System.out.print((char)(ch05 -32));

		

	}
}
