import java.math.BigInteger;

public class Question16 {
	public static void main(String args[]) {
		BigInteger a;
		a = Power();
		System.out.println(a);
		String myString = a.toString();
		System.out.println(myString);
		System.out.println(SumNumsOfString(myString));
		
	}
	public static BigInteger Power() {
		BigInteger ans = new BigInteger("2");
		BigInteger con = new BigInteger("2");
		for (int i = 1; i < 1000; i++) {
			ans = ans.multiply(con);
		}
		return ans;
	}
	public static int SumNumsOfString(String a) {
		int total = 0;
		for (int i = 0; i < a.length(); i++) {
			total += a.charAt(i) - 48;
		}
		return total;
	}
	
}
