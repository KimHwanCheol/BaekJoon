import java.util.Scanner;
//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
public class multiplicationTable  {
	public static void main(String args[]) {
		
		int inputNum;
		
		Scanner sc = new Scanner(System.in);
		inputNum = sc.nextInt();
		
		for(int i = 1; i<=9;i++) {
			System.out.println(inputNum +" * " + i +" = " + (inputNum*i));
		}
	}
}
