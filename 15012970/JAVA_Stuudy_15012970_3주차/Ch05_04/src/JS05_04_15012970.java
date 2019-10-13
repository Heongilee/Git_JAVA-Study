import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;// 비율
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.println(getSrcString()+"을 입력하세요 >>");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변한 결과: "+res+getDestString()+"입니다.");
		sc.close();
	}
}

class Km2Mile extends Converter{
	private static final double K2M = 1.6;
	
	public Km2Mile(double src) {	//생성자로 비율을 초기화 한다.
		ratio = src;
	}
	
	@Override
	protected double convert(double src) {
		//src는 km src / 1.6 = ? Mile
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
		Km2Mile toMile = new Km2Mile(1.6);	//1마일은 1.6Km 
		toMile.run();
	}
}
