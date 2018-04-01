import java.util.*;
import java.lang.*;

//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

public class totalAdd {
	public static void main(String args[]) {
		
		int num1; //두번째 입력으로 주어질 숫자의 갯수
		String num2 = "";
		int result = 0;
				
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt(); //num1을 int형으로 받아서 배열의 크기를 정하고
		num2 = sc.next(); //num2를 String 형으로 받아서 totalNum배열에 저장
		
		char[] totalNum = new char[num1]; 
		totalNum = num2.replaceAll("", "").toCharArray();

		for(int i =0;i<num1;i++) {
			result = result + Integer.parseInt(String.valueOf(totalNum[i]));
		}//배열 내부 각각의 인덱스를 숫자로 변환하여 result에 더함

		System.out.println(result);
	}
}
