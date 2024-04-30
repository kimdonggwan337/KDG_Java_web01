package Java_web01;

public class BooleanTest {

	public static void main(String[] args) {
		boolean b1 = true;
		System.out.println("b1= " + b1);
		
		b1 = false;
		
		System.out.println("b1= " + b1);
		if(b1) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		boolean b2 = false;
		b2 = Boolean.parseBoolean("true");
				System.out.println("b2= " + b2);
		
		
		
	}

}
