import java.util.Scanner;
//ù° �ٿ��� �� N��, ��° �ٿ��� �� N-1��, ..., N��° �ٿ��� �� 1���� ��� ����
//������, �������� �������� ������ �� (���� ����)�� ����Ͻÿ�.
public class printStar {
	public static void main(String args[]) {
		
		int inputNum;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		for(int i = 1; i<=inputNum;i++) {
			for(int j = 1;j<i;j++) {
				System.out.print(" ");
			}
			for(int k = i;k<=inputNum;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
