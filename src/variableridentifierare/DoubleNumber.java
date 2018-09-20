package variableridentifierare;

public class DoubleNumber {

	public static void main(String[] args) {
		double doubleNumber = 10.0;
		int integerNumber = 10;
		
		boolean equal = doubleNumber == integerNumber;

		
		
		System.out.println(equal);
		System.out.println(doubleNumber != integerNumber);
		
		if (doubleNumber == integerNumber) {
			System.out.println("double == integer");
		} else {
			System.out.println("double != integer");
		}

		
		
		
		System.out.println(0 % 3);
		System.out.println(1 % 3);
		System.out.println(2 % 3);
		System.out.println(3 % 3);
		System.out.println(4 % 3);
		System.out.println(5 % 3);
	}

}
