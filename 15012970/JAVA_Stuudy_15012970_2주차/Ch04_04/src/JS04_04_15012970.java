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
		System.out.println("("+this.x+","+this.y+")���� ũ�Ⱑ "+this.width+"x"+this.height+"�� �簢��");
	}
	
	public boolean contains(Rectangle r)	//r�� ���� �簢���� ���ԵǾ� �ִ���...
	{
		//�� �簢�� �ȿ� ������
		if((this.x < r.x) && (r.x+r.width < this.x+this.width) && (this.y < r.y) && (r.y+r.height < this.y+this.height))
			return true;
		//�簢���� �����
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
		System.out.println("s�� ������ "+ s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
}
