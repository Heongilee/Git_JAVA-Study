import java.util.Scanner;

public class JS03_14_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55}, i;
		String input;
		
		do
		{
			System.out.print("���� �̸�>>");	input = sc.next();
			
			if(input.equals("�׸�")) return ;
			
			for(i=0;i<course.length;i++)
			{
				if(input.equals(course[i]))
				{
					System.out.println(course[i]+"�� ������ "+score[i]);
					break;
				}
				else
				{
				}
			}
			if(i == course.length) System.out.println("���� �����Դϴ�.");
			
		}while(true);
		
	}
}
