import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = n * 2;

		for (int i = 0; i < n; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y == 0) {
				System.out.println("Divisão Impossível");
			} else {
				System.out.println(x / y);
			}
			sc.close();
		}

	}

}
