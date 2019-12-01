package Num1;

import java.util.Scanner;
import java.util.Vector;

public class JS15012970_Q01 {
	public static Scanner sc = new Scanner(System.in);
	public static int max;
	private static Vector<Integer> v = new Vector<Integer>();
	public static void main(String[] args) {
		int input;
		
		System.out.print("정수(-1이 입력될 때까지)>> ");
		while(true)
		{	
			input = sc.nextInt();
			if(input == -1) break;
			
			v.add(input);
		}
		for(int i=0;i<v.size();i++)
		{
			if(i == 0)
			{
				max = v.get(i);
				continue;
			}
			else
			{
				int current_value = v.get(i);
				if(current_value > max)
				{
					max = current_value;
				}
			}
		}
		
		System.out.println("가장 큰 수는 "+max);
	}
}
