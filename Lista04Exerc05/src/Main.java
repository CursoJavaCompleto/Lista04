import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fatorial = n;
		if (n == 0) {
			fatorial = 1;
		}

		for (int i = 1; i <= n - 1; i++) {
			fatorial = fatorial * (n - i);
		}

		System.out.println(fatorial);
		sc.close();

	}

}
