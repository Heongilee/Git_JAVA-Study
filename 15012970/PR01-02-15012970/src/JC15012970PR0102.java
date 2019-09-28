import java.lang.*;
import java.util.*;

class Phone{
	String name;			// 이름
	String num;				// 번호
	
	Phone(String name, String num)		// Constructor
	{
		this.name = name;
		this.num = num;
	}
}

public class JC15012970PR0102 {
	public static void main(String[] args) {
		int N, s;
		String name, num, search;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수>>>"); N = sc.nextInt(); 
		
		Phone p1[] = new Phone[N];	//객체 배열 선언
		
		//삽입
		for(int i=0;i<N;i++)
		{
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			name = sc.next();
			num = sc.next();
			p1[i] = new Phone(name, num);
		}
		System.out.println("저장되었습니다...");
		
		//검색
		while(true)
		{
			System.out.print("검색할 이름>>");
			search = sc.next();
			
			if(search.equals("그만"))
			{
				return;
			}
			else
			{
				for(s=0;s<N;s++)
				{
					if(p1[s].name.equals(search))
					{
						System.out.println(p1[s].name+"의 번호는 "+p1[s].num+" 입니다.");
						break;
					}
				}
				if(s == N)
				{
					System.out.println(search +" 이 없습니다.");
				}
			}						
		}//outer-loop(while) is the end...
		
	}
}