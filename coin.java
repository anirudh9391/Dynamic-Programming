import java.io.*;
import java.util.Scanner;
class coin
{
	public static void main(String ar[])
	{
		int coins[]  = {1,4,6};
		int max = 8;
		Solution obj = new Solution();
		obj.coin_change(coins , max);
	}
}
class Solution
{
	void coin_change(int coins[], int max)
	{
		int arr[][] = new int[coins.length+1][max+1];
		for(int i=0;i<=max;i++)
		{
			arr[0][i] = Integer.MAX_VALUE;
		}
		for(int i=0;i<=coins.length;i++)
		{
			arr[i][0] = 0;
		}
		for(int i=1;i<=coins.length;i++)
		{
			for(int j=1;j<=max;j++)
			{
				if(j < coins[i-1])
				{
					arr[i][j] = arr[i-1][j];
				}
				else
				{
					arr[i][j] = min(1+arr[i][j-coins[i-1]],arr[i-1][j]);
					System.out.println("check min at : "+(1+arr[i][max-coins[i-1]])+","+arr[i-1][j]+"("+i+","+j+")");
				}	
			}
		}	

		for(int i=0;i<=coins.length;i++)
		{
			for(int j=0;j<=max;j++)
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	int min(int a , int b)
	{
		if(a<b)
		{
			return a;
		}
		else
		{
			return b;
		} 
	}	
}
