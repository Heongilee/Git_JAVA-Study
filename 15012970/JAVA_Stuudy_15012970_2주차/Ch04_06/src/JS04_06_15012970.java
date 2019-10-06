import java.util.Scanner;
class Circle {
	private double x, y;	
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x; this.y = y; this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
	
	public int get_radius()
	{
		return this.radius;
	}
}
public class JS04_06_15012970 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3];
		int max_rad=0, max_rad_pos = 0;
		
		//입력
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();	 
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(i == 0) 
			{
				max_rad = c[i].get_radius();
				max_rad_pos = i;
			}
			else
			{
				if(c[i].get_radius() > max_rad)
				{
					max_rad = c[i].get_radius();
					max_rad_pos = i;
				}
				else
					continue;
			}
		}
		
		System.out.println("가장 면적이 큰 원은 ");
		c[max_rad_pos].show();
		
		//스캐너 닫기
		scanner.close();
	}
}