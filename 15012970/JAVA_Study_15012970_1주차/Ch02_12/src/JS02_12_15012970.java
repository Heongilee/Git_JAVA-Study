import java.util.Scanner;

public class JS02_12_15012970 {
	public static void Calculator(int x, String op, int y)
	{
		int res;
		
		// switch를 이용한 구현
		switch(op)
		{
		case "+":
			res= x+y;
			System.out.println(x+" + "+y+"의 계산결과는 "+ res);
			break;
		case "-":
			res= x-y;
			System.out.println(x+" - "+y+"의 계산결과는 "+ res);
			break;
		case "*":
			res= x*y;
			System.out.println(x+" * "+y+"의 계산결과는 "+ res);
			break;
		case "/":
			if(y == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			res = x / y;
			System.out.println(x+" / "+y+"의 계산결과는 "+ res);
			break;
		case "%":
			if(y == 0)
			{
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			res = x % y;
			System.out.println(x+" % "+y+"의 계산결과는 "+ res);
			break;
		}
		
//		// if-else를 이용한 구현
//		if(op.equals("+"))
//		{
//			res= x+y;
//			System.out.println(x+" + "+y+"의 계산결과는 "+ res);
//		}
//		else if(op.equals("-"))
//		{
//			res = x-y;
//			System.out.println(x+" - "+y+"의 계산결과는 "+ res);
//		}
//		else if(op.equals("*"))
//		{
//			res = x * y;
//			System.out.println(x+" * "+y+"의 계산결과는 "+ res);
//		}
//		else if(op.equals("/"))
//		{
//			if(y == 0)
//			{
//				System.out.println("0으로 나눌 수 없습니다.");
//				return;
//			}
//			else
//			{
//				res = x/y;
//				System.out.println(x+" / "+y+"의 계산결과는 "+ res);
//			}
//		}
//		else if(op.equals("%"))
//		{
//			if(y == 0)
//			{
//				System.out.println("0으로 나눌 수 없습니다.");
//				return;
//			}
//			else
//			{
//				res = x%y;
//				System.out.println(x+" % "+y+"의 계산결과는 "+ res);
//			}
//		}
//		else
//		{
//			System.out.println("넌 뭐냐");
//		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		String op;
		
		System.out.print("연산>>");
		x = sc.nextInt();
		op = sc.next();
		y = sc.nextInt();
		
		Calculator(x, op, y);
		
		return;
	}
}
