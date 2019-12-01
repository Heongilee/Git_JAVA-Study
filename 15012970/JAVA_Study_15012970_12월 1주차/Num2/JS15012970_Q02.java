package Num2;

import java.util.ArrayList;
import java.util.Scanner;

public class JS15012970_Q02 {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>(6);
		Scanner sc = new Scanner(System.in);
		String str; char ch;
		double sum=0.0;
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
		for(int i=0;i<6;i++)
		{
			str = sc.next();
			a.add(str.charAt(0));
		}
		
		for(char c:a)
		{
			if(c == 'A') sum += 4.0;
			else if(c == 'B') sum += 3.0;
			else if(c == 'C') sum += 2.0;
			else if(c == 'D') sum += 1.0;
			else sum += 0.0;
		}
		System.out.println(sum / 6.0);
	}
}
