import java.util.Scanner;

class Cus{
	protected String name;
	
	public Cus() {
		setSeat();
	}
}

class Seat extends Cus{
	protected static String[] Ss = new String[10];
	protected int Seat_type, Seat_num;
	
	public void S_show()
	{
		for(int i=0;i<Ss.length;i++)
		{
			if(Ss[i].equals(null)) System.out.print("--- ");
			else System.out.print(Ss[i]+" ");
		}
		System.out.println();
	}
	public void setSeat() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		int cho = sc.nextInt();
		
		switch(cho)
		{
		case 1:
			this.S_show();
			System.out.print("�̸�>>"); name = sc.next(); 
			System.out.print("��ȣ>>"); Seat_num = sc.nextInt();
			
			if(!Ss[Seat_num-1].equals(null))
				System.out.println("�̹� ����Ǿ� �ֽ��ϴ�.");
			else
				Ss[Seat_num-1] = name;
			
			break;
		case 2:
			break;
		case 3:
			break;
		}
			
		
	}
}
public class JS04_12_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cus c[] = new Cus[30];
		int choice, i=0;
		
		
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		
		do {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				c[i]
				i++;
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
			
		}while(true);
	}
}
