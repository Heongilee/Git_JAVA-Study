import java.util.Scanner;

public class JS03_06_15012970 {
	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		int balance;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		
		Scanner sc = new Scanner(System.in);
		balance = sc.nextInt();
		
		for(int i=0;i<unit.length;i++)
		{
			if(balance/unit[i] != 0)
				System.out.println(unit[i]+"�� ¥�� : "+balance/unit[i]+"��");
			
			balance %= unit[i];
		}
		
		
		sc.close();
	}��
}
