import java.lang.Math;

public class JC15012970PR0101 {
	public static void main(String[] args) {
		int cnt = 0;
		int k, i, j;
		int arr[][] = new int[4][4];
		
		//Array arr initialization.
		for(int a=0;a<4;a++)		{			for(int b=0;b<4;b++)			{				arr[a][b] = 0;			}		}
			
		int idx[][] = new int[16][2]; 
		int idx_pos = 0;
		
		//insertion
		for(;cnt < 10;)
		{
			i = (int)(Math.random() * 4); 
			j = (int)(Math.random() * 4);
			
			//인덱스 중복 검사
			for(k=0;k<=idx_pos;k++)
			{
				if(idx[k][0] == i && idx[k][1] == j)
					break;
			}
			//중복검사 후 겹치는 인덱스가 없으면 임의의 위치에 삽입.
			if(k > idx_pos)
			{
				arr[i][j] = (int)(Math.random()* 10 + 1);
				idx[idx_pos][0] = i; idx[idx_pos][1] = j;
				idx_pos++;
				cnt++;
			}
		}//outer-loop(for) is the end.
		
		//print
		for(int l=0;l<4;l++)
		{
			for (int m = 0; m < 4; m++) 
			{
				System.out.print(arr[l][m]+"\t");
			}
			System.out.println();
		}
	}
}