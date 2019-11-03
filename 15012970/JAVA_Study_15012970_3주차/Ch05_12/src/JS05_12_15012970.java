import java.util.Scanner;

abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;} //��ũ ����
	public Shape getNext() {return next;}
	public abstract void draw();	//�߻� �޼ҵ�
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
	static int flag = 0;	//0: ù ���� �� , 1: ù ���� ��
	static Shape start, end, obj;
	static int N = 0;	//��� ����
	
	public static void ViewAll() {
		Shape p = start;
		
		while(p != null){
			p.draw();
			p = p.getNext();
		}
		
		return;
	}
	
	public static void Deletion() {
		int pos, i; 	//������ ��ġ
		Shape t;	//��ȸ�� ��������
		System.out.print("������ ������ ��ġ >>"); //1~N ������ �� �Է�
		pos = sc.nextInt();
		
		if(pos > 1 && pos < N) //ó���� ���� ������ ����� ������ ������ ��.
		{
			for(i=0, t=start;(i<pos-1) && (t.getNext() != null);i++, t=t.getNext());
			
			if(i == pos-2)	//���� ã����
			{
				t = t.getNext().getNext();
				return;
			}
			if(t.getNext() == null)//ã�� ������ �����Ƿ�
			{
				System.out.println("������ �� �����ϴ�.");
				return;
			}			
		}
		else if(pos == 1)
		{
			t = start;
			start = t.getNext();
			t = null; //�÷��Ͱ� ������ ���� �޸𸮸� ���� ��ų ���̴�.
		}
		else if(pos == N) //{ pos == N }
		{
			//end��� �������� �̵��Ѵ���.
			for(i=0, t=start;i<N-2;i++, t=t.getNext());
			
			end = t;
			t = t.getNext();
			t = null;
		}
		else
		{
			System.out.println("������ �� �����ϴ�.");
			return;
		}
		
	}
	public static void Insertion() {
		int type; //�����Ϸ��� ���� ����
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
		else //ù ���� ������ ����.
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
		System.out.println("�׷��� ������ beauty��  �����մϴ�.");
		
		while(true)
		{
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
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
				System.out.println("beauty�� �����մϴ�.");
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
