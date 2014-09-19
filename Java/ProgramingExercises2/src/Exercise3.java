public class Exercise3 {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		while (true){			
			System.out.print(
					"Enter the first number: ");
			int n1 = input.nextInt();
			
			System.out.print(
					"Enter the second number: ");
			int n2 = input.nextInt();

			int smallest = (n1 < n2) ? n1 : n2;
			int gcd = -1;
			for (int d = smallest; d >= 1; d--) {
				if ((n1 % d == 0) && (n2 % d == 0)) {
					gcd = d;
					break;
				}
			}

			System.out.println("GCD of " + n1 + " and " + n2 + " is "
					+ gcd);
		}
	}
}
