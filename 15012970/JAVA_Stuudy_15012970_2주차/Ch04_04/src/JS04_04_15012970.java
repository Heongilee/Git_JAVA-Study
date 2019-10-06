class Rectangle{
	private int x, y;
	private int width, height;
	
	public Rectangle(int x, int y, int width, int height)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square()
	{
		return width * height;
	}
	
	public void show()
	{
		System.out.println("("+this.x+","+this.y+")에서 크기가 "+this.width+"x"+this.height+"인 사각형");
	}
	
	public boolean contains(Rectangle r)	//r이 현재 사각형에 포함되어 있는지...
	{
		//현 사각형 안에 있으면
		if((this.x < r.x) && (r.x+r.width < this.x+this.width) && (this.y < r.y) && (r.y+r.height < this.y+this.height))
			return true;
		//사각형을 벗어나면
		else
			return false;
	}
}

public class JS04_04_15012970 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+ s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
	}
}
