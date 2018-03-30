import java.util.Scanner;
//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
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
