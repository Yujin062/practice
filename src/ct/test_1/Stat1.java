package ct.test_1;

public class Stat1 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			for(int k = 1; k<=5; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
		
		for(int i = 0; i < 5; i++) {
			for(int k = 0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
