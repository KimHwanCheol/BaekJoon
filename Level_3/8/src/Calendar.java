import java.util.*;

public class Calendar {
	public static void main(String args[]) {
		
		int month;//��
		int day;//��
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		day = sc.nextInt();
		
		int[] monthTotalDay = {0,31,28,31,30,31,30,31,31,30,31,30}; //�� �޸��� �ִ� day ��,
		// 12���� ���� ������ ������ ������ �����ϱ� ���ؼ��� �� �� ���� ��ĥ�̿������� �˸� �Ǳ� ����
		//ex) 3�� 5���� �˰� �������� 2�������� ��� �� ���� ���ϰ� �ű⿡ 5���� ���ϸ� �Ǳ� ������ 12���� �迭���� �ʿ����
		
		for(int i = 0;i<=month-1;i++) { //���ϰ��� �ϴ� ���� �� �ޱ��� ��� �� ���� result�� ���� 
			result = result + monthTotalDay[i];
		}
		
		result = result + day; //������ result�� ���ϰ��� �ϴ� ���� day�� result�� ����
		
		switch(result%7) {
			case 0:
				System.out.println("SUN");
				break;
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			default:
				break;
			
		}
		
	}
}
