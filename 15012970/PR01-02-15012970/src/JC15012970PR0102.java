import java.lang.*;
import java.util.*;

class Phone{
	String name;			// �̸�
	String num;				// ��ȣ
	
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
		
		System.out.print("�ο���>>>"); N = sc.nextInt(); 
		
		Phone p1[] = new Phone[N];	//��ü �迭 ����
		
		//����
		for(int i=0;i<N;i++)
		{
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = sc.next();
			num = sc.next();
			p1[i] = new Phone(name, num);
		}
		System.out.println("����Ǿ����ϴ�...");
		
		//�˻�
		while(true)
		{
			System.out.print("�˻��� �̸�>>");
			search = sc.next();
			
			if(search.equals("�׸�"))
			{
				return;
			}
			else
			{
				for(s=0;s<N;s++)
				{
					if(p1[s].name.equals(search))
					{
						System.out.println(p1[s].name+"�� ��ȣ�� "+p1[s].num+" �Դϴ�.");
						break;
					}
				}
				if(s == N)
				{
					System.out.println(search +" �� �����ϴ�.");
				}
			}						
		}//outer-loop(while) is the end...
		
	}
}