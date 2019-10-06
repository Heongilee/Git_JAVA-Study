import java.util.Scanner;

public class JS03_14_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55}, i;
		String input;
		
		do
		{
			System.out.print("과목 이름>>");	input = sc.next();
			
			if(input.equals("그만")) return ;
			
			for(i=0;i<course.length;i++)
			{
				if(input.equals(course[i]))
				{
					System.out.println(course[i]+"의 점수는 "+score[i]);
					break;
				}
				else
				{
				}
			}
			if(i == course.length) System.out.println("없는 과목입니다.");
			
		}while(true);
		
	}
}
