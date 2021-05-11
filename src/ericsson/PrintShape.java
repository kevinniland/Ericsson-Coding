package ericsson;

public class PrintShape {
	public String printShape(int size) {
		String res = "";

		for (int i = 0; i < size - 1; i++) {
			res += "L\n";
		}
		
		for (int j = 0; j < size; j++) {
			res += "L";
		}

		// System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		new PrintShape().printShape(4);
	}
}
