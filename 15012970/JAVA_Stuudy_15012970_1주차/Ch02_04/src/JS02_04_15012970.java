import java.util.Scanner;

class function{
	private int a;
	private int b;
	
	public void swap(int a, int b)
	{
		this.a = b;
		this.b = a;
	}
	
	public int get_a()
	{
		return this.a;
	}
	
	public int get_b()
	{
		return this.b;
	}
}

public class JS02_04_15012970 {
	public static void main(String[] args) {
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		function f1 = new function();
		
		System.out.print("정수 3개 입력>>");
		for(int i=0;i<3;i++)
			arr[i] = sc.nextInt();
		
		for(int i=0;i<3;i++)
		{
			for(int j=i+1;j<3;j++)
			{
				if(arr[i] >= arr[j])
				{
					f1.swap(arr[i], arr[j]);
					arr[i] = f1.get_a();
					arr[j] = f1.get_b();
				}
			}
		}//outer-loop(for)
		
		System.out.println("중간 값은 "+ arr[1]);
	}
}
