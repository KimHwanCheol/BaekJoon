import java.util.*;

//����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. �������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.

//����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.

//����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class sugarDelivery {
	public static void main(String args[]) {
		
		int sugarWeight; //���� ����
		int five_result; //���� ����
		int three_result;
		
		Scanner sc = new Scanner(System.in);
		
		sugarWeight = sc.nextInt();
		
		if(sugarWeight%5 == 0) {
			five_result = sugarWeight/5;
			System.out.println(five_result);
		}else if(sugarWeight%3 == 0) {
			three_result = sugarWeight/3;
		}else if(sugarWeight<3) {
			System.out.println("-1");
		}else if(sugarWeight%5 != 0) {
			five_result = sugarWeight/5;
			
		}
		
	}
}
