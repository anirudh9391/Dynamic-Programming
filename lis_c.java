class lis_c
{
        public static void main(String ar[])
        {
                int arr[] = {4,-1,3,6,5,7,1};
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
                        for(int j=0;j<i;j++)
                        {
                                if(arr[i] > arr[j])
                                {
                                        T[i] = max(T[i] , T[j]+1);
                                }
                        }
                }

                for(int i=0;i<n;i++)
                {
                        System.out.print(T[i]+"\t");
                }

        }
}

