import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int aux = 0;

		if (x < y) {
			for (int i = x + 1; i < y; i++) {
				if (i % 2 != 0) {
					aux += i;
				}
			}
		} else {
			for (int i = y + 1; i < x; i++) {
				if (i % 2 != 0) {
					aux += i;
				}
			}
		}
		System.out.println(aux);
		sc.close();
	}

}
