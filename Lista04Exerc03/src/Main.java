import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double m1,m2,m3;
		m1 = m2 = m3 = 0;
		int p1 = 2;
		int p2 = 3;
		int p3 = 5;
		
		
		for (int i = 0; i < n; i++) {
			double v1 = sc.nextDouble();
			double v2 = sc.nextDouble();
			double v3 = sc.nextDouble();
			if (i == 0) {
				m1 = (v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3);
			}
			else if (i == 1) {
				m1 = (v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3);
			}
			else {
				m1 = (v1 * p1 + v2 * p2 + v3 * p3) / (p1 + p2 + p3);
			}
		}
		System.out.printf("%.1f%n",m1);
		System.out.printf("%.1f%n",m2);
		System.out.printf("%.1f%n",m3);
		sc.close();
	}

}
