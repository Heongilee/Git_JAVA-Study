import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;} //링크 연결
	public Shape getNext() {return next;}
	public abstract void draw();	//추상 메소드
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

public class JS05_12_15012970 {
	static Scanner sc = new Scanner(System.in);
	static int flag = 0;	//0: 첫 삽입 전 , 1: 첫 삽입 후
	static Shape start, end, obj;
	static int N = 0;	//노드 개수
	
	public static void ViewAll() {
		Shape p = start;
		
		while(p != null){
			p.draw();
			p = p.getNext();
		}
		
		return;
	}
	
	public static void Deletion() {
		int pos, i; 	//삭제할 위치
		Shape t;	//순회할 참조변수
		System.out.print("삭제할 도형의 위치 >>"); //1~N 사이의 수 입력
		pos = sc.nextInt();
		
		if(pos > 1 && pos < N) //처음과 끝을 제외한 노드의 삭제를 수행할 때.
		{
			for(i=0, t=start;(i<pos-1) && (t.getNext() != null);i++, t=t.getNext());
			
			if(i == pos-2)	//도형 찾았음
			{
				t = t.getNext().getNext();
				return;
			}
			if(t.getNext() == null)//찾는 도형이 없으므로
			{
				System.out.println("삭제할 수 없습니다.");
				return;
			}			
		}
		else if(pos == 1)
		{
			t = start;
			start = t.getNext();
			t = null; //컬렉터가 적당한 때에 메모리를 해제 시킬 것이다.
		}
		else if(pos == N) //{ pos == N }
		{
			//end노드 이전까지 이동한다음.
			for(i=0, t=start;i<N-2;i++, t=t.getNext());
			
			end = t;
			t = t.getNext();
			t = null;
		}
		else
		{
			System.out.println("삭제할 수 없습니다.");
			return;
		}
		
	}
	public static void Insertion() {
		int type; //삽입하려는 모형 종류
		System.out.print("Line(1), Rect(2), Circle(3)>>");
		type = sc.nextInt();
		
		if(flag == 0)
		{
			switch(type){
			case 1:	//Line
				obj = new Line();
				start = end = obj;
				N++;
				break;
			case 2:	//Rectangle
				obj = new Rect();
				start = end = obj;
				N++;
				break;
			case 3:	//Circle
				obj = new Circle();
				start = end = obj;
				N++;
				break;
			default:
				break;
			
			}
			flag = 1;
		}
		else //첫 삽입 이후의 삽입.
		{
			switch(type){
			case 1:	//Line
				obj = new Line();
				end.setNext(obj);
				end = obj;
				N++;
				break;
			case 2:	//Rectangle
				obj = new Rect();
				end.setNext(obj);
				end = obj;
				N++;
				break;
			case 3:	//Circle
				obj = new Circle();
				end.setNext(obj);
				end = obj;
				N++;
				break;
			default:
				break;
				
			}			
		}
		
		
		
	}
	public static void Menu() {
		int choice;
		System.out.println("그래픽 에디터 beauty를  실행합니다.");
		
		while(true)
		{
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			choice = sc.nextInt();
			
			switch(choice){
			case 1:	//insertion
				Insertion();
				break;
			case 2:	//delete
				Deletion();
				break;
			case 3: //View
				ViewAll();
				break;
			case 4: //quit
				System.out.println("beauty를 종료합니다.");
				return;
			default:
				continue;
			}
		}
		
	}
	public static void main(String[] args) {
		Menu();
		
		return;
	}
}
