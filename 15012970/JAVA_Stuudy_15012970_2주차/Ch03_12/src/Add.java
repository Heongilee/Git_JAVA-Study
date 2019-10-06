public class Add {
	public static void main(String[] args) {
		int sum = 0;
		if(args.length == 0)
		{
			System.out.println("아무런 인자도 없습니다.");
		}
		
		for(int i=0;i<args.length;i++)
		{
			try {
				sum += Integer.parseInt(args[i]);				
			}
			catch(NumberFormatException e)
			{
			}
		}
		
		System.out.println(sum);
	}
}
