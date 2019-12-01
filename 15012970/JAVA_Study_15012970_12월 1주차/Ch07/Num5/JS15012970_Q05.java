package Num5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JS15012970_Q05 {
	private static Scanner sc = new Scanner(System.in);
	private static int N = 4;
	public static ArrayList<Student> s = new ArrayList<Student>(); 
	public static class Student{
		private String name;
		private String major;
		private int no;
		private double avg;
		
		public Student(String name, String major, int no, double avg) {
			this.name = name;
			this.major = major;
			this.no = no;
			this.avg = avg;
		}
		public void Print() {
			System.out.println("------------------------------------------------------");
			System.out.println("이름 : "+name);
			System.out.println("학과 : "+major);
			System.out.println("학번 : "+no);
			System.out.println("학점평균 : "+avg);
		}
	}
	public static void main(String[] args) {
		String input, name = null, major = null;
		int no = 0;
		double avg = 0;
		
		while(true)
		{
			for(int i=0;i<N;)
			{
				System.out.print(">>");
				input = sc.nextLine();
				
				StringTokenizer st = new StringTokenizer(input, ", ");
				
				try {
					int j = 0;
					while(st.hasMoreTokens())
					{
						switch(j)
						{
						case 0:
							name = st.nextToken();
							break;
						case 1:
							major = st.nextToken();
							break;
						case 2:
							no = Integer.parseInt(st.nextToken());
							break;
						case 3:
							avg = Double.parseDouble(st.nextToken());
							break;
						default:
							break;
						}
						j++;
					}
				}catch(java.lang.NumberFormatException e) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				
				s.add(new Student(name, major, no, avg));
				i++;
			}
			
			for(int i=0;i<4;i++)
			{
				Student instance = s.get(i);
				instance.Print();
			}
			System.out.println("------------------------------------------------------");
			
		}
		
		
	}
}
