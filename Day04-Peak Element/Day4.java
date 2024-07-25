class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {
        if(n==1) return 0;
        if(arr[0]>=arr[1]){
            return 0;
        }
        int idx=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]>=arr[i+1]){
                return i;
            }
        }
        return n-1;
    }
}
