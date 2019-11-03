import java.util.Scanner;

class Dictionary{
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
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
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true)
		{
			System.out.print("�ѱ� �ܾ�?");
			input = sc.next();
			
			if(input.equals("�׸�")) return ;
			else
			{
				if(d.kor2Eng(input).equals("NULL"))
				{
					System.out.println(input+"�� ���� ������ �����ϴ�.");
				}
				else
				{
					System.out.println(input+"�� "+d.kor2Eng(input));
				}
			}
		}//infinite outer-loop while
		
	}
}
