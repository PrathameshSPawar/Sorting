class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    private void mergeSort(int arr[],int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);

        merge(arr,left,mid,right);
    }

    private void merge(int arr[],int left,int mid,int right)
    {
        int p=mid-left+1;
        int a=right-mid;
        
        int left1[]=new int[p];
        int right1[]=new int[a];

        for(int i=0;i<p;i++)
        {
            left1[i]=arr[left+i];
        }

        for(int i=0;i<a;i++)
        {
            right1[i]=arr[mid+1+i];
        }

        int i=0,j=0,k=left;

        while(i!=p && j!= a)
        {
            if(left1[i]>right1[j])
            {
                arr[k]=right1[j];
                j++;
            }else{
                arr[k]=left1[i];
                i++;
            }
            k++;
        }

        while(i!=p)
        {
            arr[k]=left1[i];
            i++;
            k++;
        }

        while(j!=a)
        {
            arr[k]=right1[j];
            j++;
            k++;
        }
    }
}
