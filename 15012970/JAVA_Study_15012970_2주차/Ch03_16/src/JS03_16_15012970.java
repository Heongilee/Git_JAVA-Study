import java.util.Scanner;
import java.lang.Math;

public class JS03_16_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"가위", "바위", "보"};
		String rsp;
		int com_idx;
		while(true)
		{
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.print("가위 바위 보!>>");
			rsp = sc.next();
			
			//컴퓨터의 패를 결정.
			com_idx = (int)(Math.random() * 3);
			
			//종료 조건
			if(rsp.equals("그만")) break;
			
			if(str[com_idx].equals("가위"))
			{
				if(rsp.equals("가위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 비겼습니다.");
				}
				else if(rsp.equals("바위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 사용자가 이겼습니다.");
				}
				else if(rsp.equals("보"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 컴퓨터가 이겼습니다.");
				}
			}
			else if(str[com_idx].equals("바위"))
			{
				if(rsp.equals("가위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 컴퓨터가 이겼습니다.");
				}
				else if(rsp.equals("바위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 비겼습니다.");
				}
				else if(rsp.equals("보"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 사용자가 이겼습니다.");
				}				
			}
			else if(str[com_idx].equals("보"))
			{
				if(rsp.equals("가위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 사용자가 이겼습니다.");
				}
				else if(rsp.equals("바위"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 컴퓨터가 이겼습니다.");
				}
				else if(rsp.equals("보"))
				{
					System.out.println("사용자 = "+rsp+" , 컴퓨터 = "+str[com_idx]+", 비겼습니다.");
				}				
			}
		}
		
		System.out.println("게임을 종료합니다...");
	}
}
