package Num10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

abstract class Shape{
	public abstract void draw();
}
class Line extends Shape{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

public class JS15012970_Q10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		HashMap<Integer, Shape> h = new HashMap<Integer, Shape>();
		int idx=0;
		do {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3)>>");
				int sh = sc.nextInt();
				
				if(sh == 1) h.put(idx++, new Line());
				else if(sh == 2) h.put(idx++, new Rect());
				else if(sh == 3) h.put(idx++, new Circle());
				else continue;
				break;
			case 2:
				System.out.print("삭제할 도형의 위치>>");
				int pos = sc.nextInt();
				
				Shape result = h.get(pos);
				if(result == null)
				{
					System.out.println("삭제할 수 없습니다.");
				}
				else
				{
					h.remove(pos);
				}
				break;
			case 3:
				Iterator<Shape> it = h.values().iterator();
				while(it.hasNext())
				{
					it.next().draw();
				}
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				return;
			default:
				continue;
			}
			
			
		}while(true);
	}
}
