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
			System.out.print("�α� �˻� >> ");
			s = sc.next();
			
			if(s.equals("�׸�")) break;
			
			if(h.containsKey(s))
			{
				int res = h.get(s).intValue();
				System.out.println(s+"�� �α��� "+res);
			}
			else
			{
				System.out.println(s+" ����� �����ϴ�.");
			}
		}
	}
	private static void run() {
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");
		int people;
		String nation;
		while(true)
		{
			System.out.print("���� �̸�, �α� >> ");
			nation = sc.next();
			
			if(nation.equals("�׸�")) break;
			people = sc.nextInt();
			
			h.put(nation, people);
		}
		
		Search();
	}
	public static void main(String[] args) {
		run();
	}
}
