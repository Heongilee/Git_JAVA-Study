import java.util.Scanner;

public class JS02_06_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		n = sc.nextInt();
		
		System.out.print("�ڼ�");
		
		if((n / 10) % 3 == 0)
		{
			System.out.print("¦");
		}
		if((n % 10) % 3 == 0)
		{
			System.out.println("¦");
		}
		
	}
}
