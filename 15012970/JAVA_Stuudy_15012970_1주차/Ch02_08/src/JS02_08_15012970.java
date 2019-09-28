import java.util.Scanner;

public class JS02_08_15012970 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
	{
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
		{
			return true; //점 x, y가 rect으로 이루어진 사각형 안에 있다.
		}
		else return false;	//없다.
	}
	
	public static void main(String[] args) {
		int x1, y1, x2, y2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형 (x1, y1), (x2, y2)를 입력하세요 >> ");
		
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		if(inRect(x1, y1, 100, 100, 200, 200) && inRect(x2, y2, 100, 100, 200, 200))
		{	//둘다 True이면 Rect와 완전히 똑같거나 포함한다는 의미이므로 
			System.out.println("입력받은 사각형("+x1+", "+y1+") ("+x2+", "+y2+")는 사각형에 완전히 포함되어 있습니다.");
		}
		else if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200))
		{	//둘 중 하나라도 들어가 있으면 겹치므로
			System.out.println("입력받은 사각형("+x1+", "+y1+") ("+x2+", "+y2+")는 사각형과 충돌이 발생합니다.");
		}
		else
		{
			System.out.println("입력받은 사각형("+x1+", "+y1+") ("+x2+", "+y2+")는 응~ 안 겹쳐.");
		}
	}
}
