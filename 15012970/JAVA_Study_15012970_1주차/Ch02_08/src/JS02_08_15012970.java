import java.util.Scanner;

public class JS02_08_15012970 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
	{
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
		{
			return true; //�� x, y�� rect���� �̷���� �簢�� �ȿ� �ִ�.
		}
		else return false;	//����.
	}
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�簢�� (x1, y1), (x2, y2)�� �Է��ϼ��� >> ");
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		if(inRect(x1, y1, 100, 100, 200, 200) && inRect(x2, y2, 100, 100, 200, 200))
		{	//�Ѵ� True�̸� Rect�� ������ �Ȱ��ų� �����Ѵٴ� �ǹ��̹Ƿ� 
			System.out.println("�Է¹��� �簢��("+x1+", "+y1+") ("+x2+", "+y2+")�� �簢���� ������ ���ԵǾ� �ֽ��ϴ�.");
		}
		else if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
		{	//�� �� �ϳ��� �� ������ ��ġ�Ƿ�
			System.out.println("�Է¹��� �簢��("+x1+", "+y1+") ("+x2+", "+y2+")�� �簢���� �浹�� �߻��մϴ�.");
		}
		else
		{
			System.out.println("�Է¹��� �簢��("+x1+", "+y1+") ("+x2+", "+y2+")�� ��~ �� ����.");
		}
	}
}
