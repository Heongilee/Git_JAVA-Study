package Num4;

import java.util.Scanner;
import java.util.Vector;

public class JS15012970_Q04 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		while(true) 
		{
			System.out.print("������ �Է� (0 �Է½� ����)>>");
			int input = sc.nextInt();
			
			if(input == 0) break;
			v.add(input);
			sum += input;
			for(int i=0;i<v.size();i++)
			{
				System.out.print(" "+v.elementAt(i));
			}	System.out.println();
			
			System.out.println("���� ��� : "+ sum / v.size());
		}
	}
}
