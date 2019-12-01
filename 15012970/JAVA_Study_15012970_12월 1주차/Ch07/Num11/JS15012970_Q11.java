package Num11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class JS15012970_Q11 {
	private static Scanner sc  = new Scanner(System.in);
	private static HashMap<String, String> nations = new HashMap<String, String>(); 
	public static void _1() {
		String nation, capital;
		System.out.println("현재 "+nations.size()+"개 나라와 수도가 입력되어 있습니다.");
		
		while(true)
		{
			System.out.print("나라와 수도 입력"+(nations.size() + 1)+">>");
			nation = sc.next();
			
			if(nation.equals("그만")) break;
			capital = sc.next();
			
			if(nations.containsKey(nation))
			{
				System.out.println(nation+"는 이미 있습니다!");
			}
			else
			{
				nations.put(nation, capital);
			}
		}
	}
	public static void _2() {
		Set<String> Quiz = nations.keySet();
		Iterator<String> q = Quiz.iterator();
		String answer;
		while(q.hasNext())
		{
			String Question = q.next();
			System.out.print(Question+"의 수도는 ? ");
			answer = sc.next();
			
			if(answer.equals("그만")) break;
			
			if(nations.get(Question).equals(answer))
			{
				System.out.println("정답!!");
			}
			else
			{
				System.out.println("아닙니다!!");
			}
		}
	}
	
	public static void run() {
		int c;
		
		while(true)
		{
			System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
			System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
			c = sc.nextInt();
			
			switch(c)
			{
			case 1:
				_1();
				break;
			case 2:
				_2();
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				return;
			default:
				break;
			}
			
		}
	}
	public static void main(String[] args) {
		run();
	}
}
