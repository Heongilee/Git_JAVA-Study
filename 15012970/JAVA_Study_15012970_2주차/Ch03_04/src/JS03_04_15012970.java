import java.util.Scanner;

public class JS03_04_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		char ch, k;
		int Alpha_pos, i, j;
		
		System.out.print("소문자 알파벳을 하나를 입력하시오>>");
		input = sc.next();
		
		//String -> char로 형변환
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
