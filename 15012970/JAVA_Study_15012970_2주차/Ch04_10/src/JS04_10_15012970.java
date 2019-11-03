import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word)
	{
		int i;
		for(i=0;i<kor.length;i++)
		{
			if(kor[i].equals(word))
			{
				return eng[i];
			}
			else continue;
		}
		return "NULL";
	}
	
}
public class JS04_10_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		Dictionary d = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true)
		{
			System.out.print("한글 단어?");
			input = sc.next();
			
			if(input.equals("그만")) return ;
			else
			{
				if(d.kor2Eng(input).equals("NULL"))
				{
					System.out.println(input+"는 저의 사전에 없습니다.");
				}
				else
				{
					System.out.println(input+"는 "+d.kor2Eng(input));
				}
			}
		}//infinite outer-loop while
		
	}
}
