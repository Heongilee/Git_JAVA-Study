package Num6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

class Location{
	private String city;
	private int lat;	//위도
	private int lon;	//경도
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
		
		System.out.println("도시, 위도, 경도를 입력하세요");
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
			System.out.print("도시이름 >>");
			search = sc.next();
			
			if(search.equals("그만")) break;
			
			Location result = h.get(search);
			if(result == null)
			{
				System.out.println(search+"는 없습니다.");
			}
			else
			{
				System.out.println(result.getCity()+" "+result.getLat()+" "+result.getLon());
			}
			
			
		}
	}
}
