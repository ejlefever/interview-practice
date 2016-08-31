public class findTotal {
//want a method to return 1 + 2 + 3 + 4 + ... + n

	public static void main(String[] args) {

		//Driver code
		System.out.println(findTotal(5));
		System.out.println(findTotal(4));
		System.out.println(findTotal(3));
		System.out.println(findTotal(2));
		System.out.println(findTotal(1));

	}

	public static int findTotal(int n) {

		if (n < 1) {
			return -1; //edge case - must at least be 1!
		} else {
			if (n == 1) { //base case
				return 1;
			} else {
				return n + findTotal(n-1);
			}
		}

	}
}