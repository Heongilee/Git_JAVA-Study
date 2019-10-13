import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;// ����
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.println(getSrcString()+"�� �Է��ϼ��� >>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("���� ���: "+res+getDestString()+"�Դϴ�.");
		sc.close();
	}
}

class Km2Mile extends Converter{
	private static final double K2M = 1.6;
	
	public Km2Mile(double src) {	//�����ڷ� ������ �ʱ�ȭ �Ѵ�.
		ratio = src;
	}
	
	@Override
	protected double convert(double src) {
		//src�� km src / 1.6 = ? Mile
		return src / K2M;
	}@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}
}

public class JS05_04_15012970 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);	//1������ 1.6Km 
		toMile.run();
	}
}
