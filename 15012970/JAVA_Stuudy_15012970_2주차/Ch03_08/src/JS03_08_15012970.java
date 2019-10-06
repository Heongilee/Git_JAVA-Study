import java.util.Scanner;

public class JS03_08_15012970 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, num;
		int[][] arr = new int[10][10];
		int i_pos=0, j_pos=0;	//현재 삽입할 위치를 나타내는 변수
		int flag = 0;		// 0 : default(배열 내에 중복되는 수가 없다.)
							// 1 : 중복되는 수가 있다.
		
		
		System.out.print("정수 몇개?"); N = sc.nextInt();
		
		for(int n=0;n<N;n++)
		{
			while(true)
			{
				num = (int)(Math.random()* 100 + 1);
				flag = 0;
				for(int i=0;i<i_pos;i++)
				{
					for(int j=0;j<j_pos;j++)
					{
						if(arr[i][j] == num) //중복되는 수가 있다면
						{
							flag = 1;
							break;
						}
					}
					if(flag == 1) break;
				}
				if(flag == 1) continue;
				if(flag == 0) break;
			}//infinite outer-loop while
			
			arr[i_pos][j_pos++] = num;
			
			if(j_pos / 10 != 0) i_pos++;
			
			i_pos %= 10; j_pos %= 10;			
		}
		
		for(int k=0;k<arr.length;k++)
		{
			for(int l=0;l<arr[k].length;l++)
			{
				if(arr[k][l] == 0) break;
				System.out.print(arr[k][l]+" ");
			}
			System.out.println();
		}
		
	}
}
