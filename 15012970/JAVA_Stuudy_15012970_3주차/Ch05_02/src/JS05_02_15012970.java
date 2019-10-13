class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}
class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	public void PrintProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}

class IPTV extends ColorTV{
	private String ip;
	public IPTV(String ip, int size, int color) {
		// TODO Auto-generated constructor stub
		super(size, color);
		this.ip = ip;
	}
	public void PrintProperty() {
		System.out.print("나의 "+ this.getClass().getName() +"는 "+ ip +" 주소의 ");
		super.PrintProperty();
	}
}

public class JS05_02_15012970 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.PrintProperty();
	}
}
