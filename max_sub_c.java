/*
Maximum sub-array sum non contiguous
*/

class max_c
{
	public static void main(String ar[])
	{
		//int arr[] = {2,-1,6,4,-7,8,10,-3,-4,7,-11};
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		
		int n = arr.length;
		//int max[] = new int[n];
		int maxi = arr[0];
		int sum=arr[0];

		util obj = new util();
		for(int i=1;i<n;i++)
		{
			sum = obj.max(arr[i] , sum + arr[i]);
			maxi = obj.max(maxi , sum);		
		}

		System.out.println(maxi);
	}
}
class util
{
	int max(int a , int b)
	{
		if(a>b)
		return a;
		else
		return b;
	}
}
		
