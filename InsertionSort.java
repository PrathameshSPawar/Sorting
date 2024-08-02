public static InsertionSort
{
  public static void insertion(int arr[], int n)
	{
        // Base case: If the array is of length 1 or less, it's already sorted
        if (n <= 1) 
        {
            return;
        }

        // Sort the first n-1 elements
        insertion(arr, n - 1);

        // Insert the nth element into the sorted portion
        int key = arr[n - 1];
        int j = n - 2;

        // Shift elements of the sorted portion to the right to make space for the key
        while (j >= 0 && arr[j] > key) 
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
