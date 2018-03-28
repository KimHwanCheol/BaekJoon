import java.util.*;

public class remainderOperation {
	public static void main(String args[]) {
		
		//나머지를 출력하는 방식을 달리 했을 때 값이 같게 나오는지 확인하기 위한 문제
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		
		System.out.println((num1 + num2) % num3);
		System.out.println((num1 % num3 + num2 % num3) % num3);
		System.out.println((num1 * num2) % num3);
		System.out.println((num1 % num3 * num2 % num3) % num3);
	
	}
}
