import java.util.*;
//n�� �־����� ��, 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
