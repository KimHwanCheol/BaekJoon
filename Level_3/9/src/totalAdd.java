import java.util.*;
//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class totalAdd {
	public static void main(String args[]) {
		
		int inputNum;
		int result=0;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		for(int i = 1; i<=inputNum;i++) {
			result = result + i;
		}
		
		System.out.println(result);
	}
}
