package ericsson;

public class WordxNum {
	public int multiply(String stringVal, int numVal) {
		int num = 0;
		
		switch(stringVal) {
		case "One":
			num = 1;
			break;
		case "Two":
			num = 2;
			break;
		case "Three":
			num = 3;
			break;
		case "Four":
			num = 4;
		case "Five":
			num = 5;
			break;
		}
		
		int result = num * numVal;
		
		// System.out.println("Result (" + stringVal + " x " + numVal + "): " + result);

		return result;
	}
	
	public static void main(String[] args) {
		new WordxNum().multiply("Three", 10);
	}
}
