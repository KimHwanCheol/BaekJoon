import java.util.Scanner;
//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
public class printStar {
	public static void main(String args[]) {
		
		int inputNum;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		for(int i = 1; i<=inputNum;i++) {
			for(int j = 1;j<=inputNum-i;j++) {
				System.out.print(" ");
			}
			for(int k = inputNum-i;k<inputNum;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
