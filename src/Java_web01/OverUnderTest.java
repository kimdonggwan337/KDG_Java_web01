package Java_web01;

public class OverUnderTest {

	public static void main(String[] args) {
				
		byte b1 = 127;
		short s1 = 32767;
		int num1 = 2147483647;
		int num2 = -2147483648;
		long num3 = 9223372036854775807L;
		long num4 = -9223372036854775808L;
		
		System.out.println("b1= " + b1);
		System.out.println("s1= " + s1);
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("num3= " + num3);
		System.out.println("num4= " + num4);
		
		
		num1 = num1 + 1;
		num2 = num2 - 1;
		num3 = num3 + 1;
		num4 = num4 - 1;
		
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("num3= " + num3);
		System.out.println("num4= " + num4);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
	}

}
