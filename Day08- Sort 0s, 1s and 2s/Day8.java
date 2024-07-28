class Solution
{
    public static void sort012(int arr[], int n)
    {
        int s=0;
        int m=0;
        int e=n-1;
        
        while(m<=e){
            if(arr[m]==2){
                int temp = arr[e];
                arr[e]=arr[m];
                arr[m]=temp;
                e--;
                
            }else if(arr[m]==0){
                int temp = arr[s];
                arr[s]=arr[m];
                arr[m]=temp;
                m++;
                s++;
            }else{
                m++;
            }
        }
        
    }
}
