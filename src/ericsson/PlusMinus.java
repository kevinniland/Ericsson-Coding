package ericsson;

public class PlusMinus {
	public String plusMinus(int length) {
		String res = "";

		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				res += "-";
			} else {
				res += "+";
			}
		}

		// System.out.println(res);
		return res;
	}
	
	public static void main(String[] args) {
		new PlusMinus().plusMinus(10);
	}
}
