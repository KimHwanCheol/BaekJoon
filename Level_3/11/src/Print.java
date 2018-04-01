import java.util.*;

public class Print {
	public static void main(String args[]) {
		
		String input;
		
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		
		char[] arr = new char[input.length()];
	
		arr= input.replaceAll("", "").toCharArray();
	
		for(int i = 0; i<arr.length;i++) {
			if(i !=0 && i%10 == 0) {
				System.out.println();
			}
			System.out.print(arr[i]);
		}
	}
}
