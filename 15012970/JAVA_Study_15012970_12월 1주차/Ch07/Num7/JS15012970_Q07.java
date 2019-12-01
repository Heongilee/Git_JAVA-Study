package Num7;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class JS15012970_Q07 {
	private static HashMap<String, Double> st = new HashMap<String, Double>();
	private static Scanner sc = new Scanner(System.in);
	private static int N = 5;
	public static void Print(double cutline) {
		
		//Q. 사전 순으로 정렬하려면 어떻게 해야할까??
		Set<String> k = st.keySet();
		Iterator<String> i = k.iterator();
		while(i.hasNext())
		{
			String res = i.next();
			if(st.get(res) >= cutline)
			{
				System.out.print(" "+res);
			}
		}
	}
	public static void run() {
		String name;
		double score;
		double cutline;
		System.out.println("미래장학금 관리 시스템 입니다.");
		for(int i=0;i<N;i++)
		{
			System.out.print("이름과 학점 : ");
			name = sc.next();
			score = sc.nextDouble();
			
			st.put(name, score);
		}
		System.out.print("장학생 선발 학점 기준 입력 >>");
		cutline = sc.nextDouble();
		
		Print(cutline);
	}
	public static void main(String[] args) {
		run();
	}
}
