import java.util.Scanner;

public class JS03_04_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		char ch, k;
		int Alpha_pos, i, j;
		
		System.out.print("�ҹ��� ���ĺ��� �ϳ��� �Է��Ͻÿ�>>");
		input = sc.next();
		
		//String -> char�� ����ȯ
		ch = input.charAt(0);
		
		Alpha_pos = (int)(ch - 'a' + 1);
		
		for(i=Alpha_pos;i>0;i--)
		{
			for(j=0, k='a';j<i;j++, k++) 
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		
	}
}
