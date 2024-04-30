package Java_web01;

public class BinOctHexTest {

	public static void main(String[] args) {
		int num1 = 200;
		
		int bin = 0b11010011;
		int oct = 0110;
		int hex = 0x13FC;
		
		
		System.out.println("num1= " + Integer.toBinaryString(num1));
		System.out.println("num1= " + Integer.toOctalString(num1));
		System.out.println("num1= " + Integer.toHexString(num1));
		
		
		System.out.println(num1+ bin);
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);

	}

}