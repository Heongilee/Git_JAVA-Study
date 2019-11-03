class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {return x;}
	public int getY() {return y;}
	public void setXY(int x, int y) {this.x=x; this.y=y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint() {
		super(0, 0);
		this.color = "Black";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public String toString() {
		return color+"���� ("+getX()+","+getY()+")�� �� �Դϴ�.";
	}
}

public class JS05_06_15012970 {
	public static void main(String[] args) {
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString()+"�Դϴ�.");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"�Դϴ�.");
	}
}
