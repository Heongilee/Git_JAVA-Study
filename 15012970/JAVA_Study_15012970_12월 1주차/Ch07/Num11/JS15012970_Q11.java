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
		System.out.println("���� "+nations.size()+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		
		while(true)
		{
			System.out.print("����� ���� �Է�"+(nations.size() + 1)+">>");
			nation = sc.next();
			
			if(nation.equals("�׸�")) break;
			capital = sc.next();
			
			if(nations.containsKey(nation))
			{
				System.out.println(nation+"�� �̹� �ֽ��ϴ�!");
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
			System.out.print(Question+"�� ������ ? ");
			answer = sc.next();
			
			if(answer.equals("�׸�")) break;
			
			if(nations.get(Question).equals(answer))
			{
				System.out.println("����!!");
			}
			else
			{
				System.out.println("�ƴմϴ�!!");
			}
		}
	}
	
	public static void run() {
		int c;
		
		while(true)
		{
			System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
			System.out.print("�Է�:1, ����:2, ����:3 >>");
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
				System.out.println("������ �����մϴ�.");
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
