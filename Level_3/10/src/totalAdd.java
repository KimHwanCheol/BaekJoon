import java.util.*;

public class totalAdd {
	public static void main(String args[]) {
		
		int num1; //�ι�° �Է����� �־��� ������ ����
		long num2;
		long result = 0;
				
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextLong();
		
		for(long i=0,j=(long) Math.pow(10, num1-1);i<num1;i++,j/=10) {
			result = result + num2/j;
			num2 = num2 - ((num2/j)*j);
		}
		
		System.out.println(result);
		
	}
}
