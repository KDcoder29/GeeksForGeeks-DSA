class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int max = arr[n-1];
        al.add(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=max){
                al.add(0,arr[i]);
                max=arr[i];
            }
            
        }
        return al;
    }
}
