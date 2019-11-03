import java.util.Scanner;

public class JS02_12_15012970 {
	public static void Calculator(int x, String op, int y)
	{
		int res;
		
		// switch�� �̿��� ����
		switch(op)
		{
		case "+":
			res= x+y;
			System.out.println(x+" + "+y+"�� ������� "+ res);
			break;
		case "-":
			res= x-y;
			System.out.println(x+" - "+y+"�� ������� "+ res);
			break;
		case "*":
			res= x*y;
			System.out.println(x+" * "+y+"�� ������� "+ res);
			break;
		case "/":
			if(y == 0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			res = x / y;
			System.out.println(x+" / "+y+"�� ������� "+ res);
			break;
		case "%":
			if(y == 0)
			{
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			res = x % y;
			System.out.println(x+" % "+y+"�� ������� "+ res);
			break;
		}
		
//		// if-else�� �̿��� ����
//		if(op.equals("+"))
//		{
//			res= x+y;
//			System.out.println(x+" + "+y+"�� ������� "+ res);
//		}
//		else if(op.equals("-"))
//		{
//			res = x-y;
//			System.out.println(x+" - "+y+"�� ������� "+ res);
//		}
//		else if(op.equals("*"))
//		{
//			res = x * y;
//			System.out.println(x+" * "+y+"�� ������� "+ res);
//		}
//		else if(op.equals("/"))
//		{
//			if(y == 0)
//			{
//				System.out.println("0���� ���� �� �����ϴ�.");
//				return;
//			}
//			else
//			{
//				res = x/y;
//				System.out.println(x+" / "+y+"�� ������� "+ res);
//			}
//		}
//		else if(op.equals("%"))
//		{
//			if(y == 0)
//			{
//				System.out.println("0���� ���� �� �����ϴ�.");
//				return;
//			}
//			else
//			{
//				res = x%y;
//				System.out.println(x+" % "+y+"�� ������� "+ res);
//			}
//		}
//		else
//		{
//			System.out.println("�� ����");
//		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		String op;
		
		System.out.print("����>>");
		x = sc.nextInt();
		op = sc.next();
		y = sc.nextInt();
		
		Calculator(x, op, y);
		
		return;
	}
}
