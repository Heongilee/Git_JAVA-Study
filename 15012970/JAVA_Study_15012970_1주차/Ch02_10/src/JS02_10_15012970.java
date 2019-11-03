import java.lang.Math;
import java.util.Scanner;

public class JS02_10_15012970 {
	public static void inCircle(int x1, int y1, int r1, int x2, int y2, int r2)
	{
		int d = (int)(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2)));
		
		if(d > r1+r2)
		{	//안겹침
			System.out.println("두 원은 서로 안 겹친다.");
		}
		else if (d < r1+r2) 
		{	//겹침
			System.out.println("두 원은 서로 겹친다.");
		}
		else
		{	//맞 닿아 있음
			System.out.println("두 원은 서로 맞 닿아 있다.");
		}
		
		return;
	}
	public static void main(String[] args) {
		int x1, y1, r1, x2, y2, r2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		r1 = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		r2 = sc.nextInt();
		
		inCircle(x1, y1, r1, x2, y2, r2);
		
		return;
	}
}
