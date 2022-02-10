import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		int year;
		
		System.out.print("Please enter a year : ");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		
		if(year % 4 == 0) {
			System.out.println(year + " is a leap year");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}

}
