import java.util.*;

public class Operation { //사칙연산 계산문제
	public static void main(String args[]) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
				
	}
}
