package Num6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	private String city;
	private int lat;	//����
	private int lon;	//�浵
	public Location(String city, int lat, int lon) {
		this.city = city;
		this.lat = lat;
		this.lon = lon;
	}
	public String toString() {
		return lat+" "+lon;
	}
	public String getCity() {
		return city;
	}
	public int getLat() {
		return lat;
	}
	public int getLon() {
		return lon;
	}
}
public class JS15012970_Q06 {
	public static void main(String[] args) {
		HashMap<String, Location> h = new HashMap<String, Location>(4);
		Scanner sc = new Scanner(System.in);
		String input, city, search;
		int lat, lon;
		
		System.out.println("����, ����, �浵�� �Է��ϼ���");
		for(int i=0;i<4;i++)
		{
			System.out.print(">>");			
			
			input = sc.nextLine();
			
			StringTokenizer st = new StringTokenizer(input, ", ");
			city = st.nextToken();
			lat = Integer.parseInt(st.nextToken());
			lon = Integer.parseInt(st.nextToken());
			
			h.put(city, new Location(city, lat, lon));
		}
		System.out.println("-----------------------------------------------");
		Set<String> key = h.keySet();
		Iterator<String> it = key.iterator();
		while(it.hasNext())
		{
			String cur = it.next();
			System.out.println(cur+" "+ h.get(cur).toString());
		}
		System.out.println("-----------------------------------------------");
		while(true)
		{
			System.out.print("�����̸� >>");
			search = sc.next();
			
			if(search.equals("�׸�")) break;
			
			Location result = h.get(search);
			if(result == null)
			{
				System.out.println(search+"�� �����ϴ�.");
			}
			else
			{
				System.out.println(result.getCity()+" "+result.getLat()+" "+result.getLon());
			}
			
			
		}
	}
}
