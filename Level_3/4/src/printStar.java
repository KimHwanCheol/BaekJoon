import java.util.*;
//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
public class printStar {
	public static void main(String args[]) {
		
		int inputNum;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		for(int i = 1; i<=inputNum;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
