import java.lang.Math;

public class JS03_10_15012970 {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int num;
		int cnt=0, i, j;
		
		//초기 랜덤값
		num = (int)(Math.random() * 10 + 1);
		while(cnt < 10)
		{
			i = (int)(Math.random() * 4);
			j = (int)(Math.random() * 4);
			
			if(arr[i][j] != 0)	//이미 삽입된 위치이므로
				continue;
			else
			{
				arr[i][j] = num;
				num = (int)(Math.random() * 10 + 1);
				cnt++;
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
