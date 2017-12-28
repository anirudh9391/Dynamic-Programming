/*
 Longest increasing subsequence contiguous
author - Anirudh Krishnan
date - 28/12/2017
*/

class lis_c
{
        public static void main(String ar[])
        {
                int arr[] = {3,5,4,5,7,8,1};
                Solution obj = new Solution();
                obj.lis(arr);
        }
}

class Solution
{
        void lis(int arr[])
        {
                int n = arr.length;
                int T[] = new int[n];

                for(int i=0;i<n;i++)
                {
                        T[i] = 1;
                }


                for(int i=1;i<n;i++)
                {
                        
               		if(arr[i] > arr[i-1])
                        {
                        	T[i] = T[i-1]+1;
                        }
			else
			{
				T[i] = 1;
			}
			
                }

                for(int i=0;i<n;i++)
                {
                        System.out.print(T[i]+"\t");
                }

        }
}

