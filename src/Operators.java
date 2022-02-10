
public class Operators {

	public static void main(String args[]) {
		int i = 0;
		int j = 2;

		boolean b = (i < j) || (j++ > i); // double ampersand is short circuit -- if first condition is false, then it will go to the second condition on the right

		System.out.println(j); //2

		b = (i < j) | (j++ > i); //3

		System.out.println(j); //3
		
		//Ternary Operator
		int interestRate = 11;
		int loanAmount = interestRate > 10 ? 4000000 : 2000000;
		
		System.out.println(loanAmount);

	}

}
