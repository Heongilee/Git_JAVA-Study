import java.util.Scanner;
import java.lang.Math;

public class JS03_16_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"����", "����", "��"};
		String rsp;
		int com_idx;
		while(true)
		{
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.print("���� ���� ��!>>");
			rsp = sc.next();
			
			//��ǻ���� �и� ����.
			com_idx = (int)(Math.random() * 3);
			
			//���� ����
			if(rsp.equals("�׸�")) break;
			
			if(str[com_idx].equals("����"))
			{
				if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", �����ϴ�.");
				}
				else if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ����ڰ� �̰���ϴ�.");
				}
				else if(rsp.equals("��"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			else if(str[com_idx].equals("����"))
			{
				if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", �����ϴ�.");
				}
				else if(rsp.equals("��"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ����ڰ� �̰���ϴ�.");
				}				
			}
			else if(str[com_idx].equals("��"))
			{
				if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ����ڰ� �̰���ϴ�.");
				}
				else if(rsp.equals("����"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(rsp.equals("��"))
				{
					System.out.println("����� = "+rsp+" , ��ǻ�� = "+str[com_idx]+", �����ϴ�.");
				}				
			}
		}
		
		System.out.println("������ �����մϴ�...");
	}
}
