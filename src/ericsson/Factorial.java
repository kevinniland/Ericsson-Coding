package ericsson;

public class Factorial {
	/**
	* This didn't come up for me
	*/
	public int solution(int N, int K) {
		// write your code in Java SE 8
		int minus = N - K;
		int resN = 1, resK = 1, resMinus = 1;
		int calculate = 0;

		for (int i = 1; i <= N; i++) {
			System.out.println(resN);

			resN *= i;
			if (resN > 2000000000) {
				break;
			}
		}

		for (int j = 1; j <= K; j++) {
			resK *= j;
			if (resK > 2000000000) {
				break;
			}
		}

		for (int x = 1; x <= minus; x++) {
			resMinus *= x;

			if (resMinus > 2000000000) {
				break;
			}
		}

		calculate = resN / (resK * resMinus);
		System.out.println(calculate);

		if (calculate == 0 || calculate > 1000000000) {
			return -1;
		} else {
			return calculate;
		}
	}

	public static void main(String[] args) {
		new Factorial().solution(5, 3);
	}
}
