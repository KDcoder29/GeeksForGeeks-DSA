class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int idx = Math.abs(arr[i])%n;
            if(arr[idx]<0){
                al.add(idx);
            }
            arr[idx]= (-1)*arr[idx];
        }
        
        if(al.size()==0) {
            al.add(-1);
            return al;
            
        }
    return al;       
        }

    }
