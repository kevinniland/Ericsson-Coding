package ericsson;

public class PlusMinus {
	public void plusMinus(int length) {
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				System.out.print("-");
			} else {
				System.out.print("+");
			}
		}
	}
	
	public static void main(String[] args) {
		new PlusMinus().plusMinus(10);
	}
}
