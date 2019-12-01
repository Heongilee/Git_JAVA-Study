package Num3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class JS15012970_Q03 {
	public static HashMap<String, Integer> h = new HashMap<String, Integer>();
	public static Scanner sc = new Scanner(System.in);
	private static void Search() {
		String s;
		
		while(true) 
		{
			System.out.print("인구 검색 >> ");
			s = sc.next();
			
			if(s.equals("그만")) break;
			
			if(h.containsKey(s))
			{
				int res = h.get(s).intValue();
				System.out.println(s+"의 인구는 "+res);
			}
			else
			{
				System.out.println(s+" 나라는 없습니다.");
			}
		}
	}
	private static void run() {
		System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");
		int people;
		String nation;
		while(true)
		{
			System.out.print("나라 이름, 인구 >> ");
			nation = sc.next();
			
			if(nation.equals("그만")) break;
			people = sc.nextInt();
			
			h.put(nation, people);
		}
		
		Search();
	}
	public static void main(String[] args) {
		run();
	}
}
