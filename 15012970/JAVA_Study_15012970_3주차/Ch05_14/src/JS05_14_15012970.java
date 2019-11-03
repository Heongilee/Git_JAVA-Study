interface Shape{
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- 다시 그립니다. ");
		draw();
	}
}

class Oval implements Shape{
	private int A, B;
	public Oval(int A, int B) { //A x B에 내접하는 타원
		// TODO Auto-generated constructor stub
		this.A = A; this.B = B;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(A+"x"+B+"에 내접하는 타원입니다.");
		
	}@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI * A * B;
	}
}
class Rect implements Shape{
	private int w, h;
	public Rect(int w, int h) {	//10x40 크기의 사각형
		// TODO Auto-generated constructor stub
		this.w = w; this.h = h;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(w+"x"+h+"크기의 사각형입니다.");
		
	}@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)w*h;
	}
}
class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double)radius * radius * PI;
	}
}

public class JS05_14_15012970 {
	public static void main(String[] args) {
		Shape[] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);	//20x30 사각형에 내접하는 타원
		list[2] = new Rect(10, 40);	//10x40 크기의 사각형
		
		for(int i=0;i<list.length;i++) list[i].redraw();
		for(int i=0;i<list.length;i++)
			System.out.println("면적은 "+list[i].getArea());
	}
}
