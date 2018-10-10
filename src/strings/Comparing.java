package strings;

public class Comparing {
	public static void main(String[] args) {
		String romanNumber = "MMCCXXXVIII";
		int number = 0; 
		
		for (int index = 0; index < romanNumber.length(); index++) {
			System.out.println("Index = " + index);
			if (romanNumber.charAt(index) == 'I') {
				number = number + 1;	
			} 
			if (romanNumber.charAt(index) == 'V') {
				number = number + 5;	
			} 
			if (romanNumber.charAt(index) == 'X') {
				number = number + 10;	
			} 
			if (romanNumber.charAt(index) == 'L') {
				number = number + 50;	
			} 
			if (romanNumber.charAt(index) == 'C') {
				number = number + 100;	
			} 
			if (romanNumber.charAt(index) == 'D') {
				number = number + 500;	
			} 
			if (romanNumber.charAt(index) == 'M') {
				number = number + 1000;	
			} 
		}
		System.out.println(number);
	}
}
