import java.util.Scanner;

public class JS02_06_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		n = sc.nextInt();
		
		System.out.print("박수");
		
		if((n / 10) % 3 == 0)
		{
			System.out.print("짝");
		}
		if((n % 10) % 3 == 0)
		{
			System.out.println("짝");
		}
		
	}
}
