import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.close();

		int M = 0;

		for (int i = 1; i <= N; i++) {
			int num = i;
			int sum = 0;

			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}

			if (sum + i == N) {
				M = i;
				break;
			}
		}
		System.out.println(M);
	}
}
