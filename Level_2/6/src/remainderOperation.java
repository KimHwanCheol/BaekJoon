import java.util.*;

public class remainderOperation {
	public static void main(String args[]) {
		
		//�������� ����ϴ� ����� �޸� ���� �� ���� ���� �������� Ȯ���ϱ� ���� ����
		
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
