import java.util.*;
import java.lang.*;

//N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class totalAdd {
	public static void main(String args[]) {
		
		int num1; //�ι�° �Է����� �־��� ������ ����
		String num2 = "";
		int result = 0;
				
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt(); //num1�� int������ �޾Ƽ� �迭�� ũ�⸦ ���ϰ�
		num2 = sc.next(); //num2�� String ������ �޾Ƽ� totalNum�迭�� ����
		
		char[] totalNum = new char[num1]; 
		totalNum = num2.replaceAll("", "").toCharArray();

		for(int i =0;i<num1;i++) {
			result = result + Integer.parseInt(String.valueOf(totalNum[i]));
		}//�迭 ���� ������ �ε����� ���ڷ� ��ȯ�Ͽ� result�� ����

		System.out.println(result);
	}
}
