import java.util.Scanner;
//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
public class printStar {
	public static void main(String args[]) {
		
		int inputNum;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();

		for(int i = 1; i<=inputNum;i++) {
			for(int j = 0; j<=inputNum-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
