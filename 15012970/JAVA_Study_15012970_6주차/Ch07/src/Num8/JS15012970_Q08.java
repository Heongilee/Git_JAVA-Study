package Num8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Point{
	private String name;
	private int point;
	public Point(String name, int point) {
		this.name = name;
		this.point = point;
	}
	public String toString() {
		return "("+name+", "+point+")";
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
}
public class JS15012970_Q08 {
	public static void main(String[] args) {
		HashMap<String, Point> point = new HashMap<String, Point>();
		Scanner sc = new Scanner(System.in);
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ�. **");
		while(true) 
		{
			System.out.print("�̸��� ����Ʈ �Է�>>");
			String name = sc.next();
			if(name.equals("�׸�")) break;
			int p = sc.nextInt();
			
			Point result = point.get(name);
			if(result == null)
			{
				point.put(name, new Point(name, p));
			}
			else
			{
				result.setPoint(result.getPoint() + p);
			}
			
			
			Iterator<Point> it = point.values().iterator();
			while(it.hasNext()) 
			{
				System.out.print(" "+it.next().toString());
			}	System.out.println();
		}
		
		
	}
}
