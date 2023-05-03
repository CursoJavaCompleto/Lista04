import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int contadorIn = 0;
		int contadorOut = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				contadorIn++;
			} else {
				contadorOut++;
			}
		}
		System.out.println(contadorIn + " in");
		System.out.println(contadorOut + " out");

		sc.close();
	}

}
