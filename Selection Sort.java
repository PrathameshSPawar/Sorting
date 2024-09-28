  Input=  [5,1,1,2,0,0]
  Output= [0,0,1,1,2,5]

class Solution {
    public int[] sortArray(int[] nums) {
        selection(nums,0);
        return nums;
    }

    private void selection(int arr[],int n)
    {
        if(n==arr.length-1)
        {
            return;
        }

        int small=n;
        for(int i=n+1;i<arr.length;i++)
        {
            if(arr[small]>arr[i])
            {
                small=i;
            }
        }
        int temp=arr[n];
        arr[n]=arr[small];
        arr[small]=temp;

        selection(arr,n+1);
    }
}
