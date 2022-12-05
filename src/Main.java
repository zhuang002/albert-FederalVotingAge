import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nPeoples = sc.nextInt();
		
		for (int i=0;i<nPeoples;i++) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			
			if (2007 - year > 18) {
				System.out.println("Yes");
			} else if (2007 - year < 18) {
				System.out.println("No");
			} else {
				if (month < 2) {
					System.out.println("Yes");
				} else if (month > 2) {
					System.out.println("No");
				} else {
					if (day <= 27) {
						System.out.println("Yes");
					} else {
						System.out.println("No.");
					}
				}
			}
			
		}
	}

}
