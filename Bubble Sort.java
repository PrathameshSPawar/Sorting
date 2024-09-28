public class BubbleSort
{
  public static void bubble(int arr[],int n)
	{
		if(n==1)
		{
			return;
		}
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		bubble(arr, n-1);
	}
}

//Recursional Way
public static void bubbleSort(int[] nums, int n) 
{
        if (n==1)
	{
            return;
        }
        
        for(int j=0;j<n-1;j++) 
	{
            if (nums[j]>nums[j+1]) 
	    {
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
        }
        
        bubbleSort(nums,n-1);
    }
