import java.util.*;

public class Calendar {
	public static void main(String args[]) {
		
		int month;//월
		int day;//일
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		month = sc.nextInt();
		day = sc.nextInt();
		
		int[] monthTotalDay = {0,31,28,31,30,31,30,31,31,30,31,30}; //각 달마다 최대 day 수,
		// 12월이 없는 이유는 어차피 요일을 측정하기 위해서는 전 달 까지 며칠이였는지만 알면 되기 때문
		//ex) 3월 5일을 알고 싶을때는 2월까지만 모든 일 수를 구하고 거기에 5일을 더하면 되기 때문에 12월은 배열에서 필요없다
		
		for(int i = 0;i<=month-1;i++) { //구하고자 하는 월의 전 달까지 모든 일 수를 result에 더함 
			result = result + monthTotalDay[i];
		}
		
		result = result + day; //구해진 result에 구하고자 하는 월의 day를 result에 더함
		
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
