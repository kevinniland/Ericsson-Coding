package ericsson;

public class PrintShape {
	public void printShape(int size) {
		for (int i = 0; i < size - 1; i++) {
			System.out.println("L");
		}
		
		for (int j = 0; j < size; j++) {
			System.out.print("L");
		}
	}

	public static void main(String[] args) {
		new PrintShape().printShape(4);
	}
}
