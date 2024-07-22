class Solution {
    public int print2largest(List<Integer> arr) {
          boolean  check = equal(arr);
          if(check) return -1;
          
          int max=Integer.MIN_VALUE;
          int secondMax=Integer.MIN_VALUE;
          
          for(int i=0;i<arr.size();i++){
              int number = arr.get(i);
              if(arr.get(i)>max){
                  secondMax=max;
                  max=number;
              }
              else if(number<max && number > secondMax){
                  secondMax=number;
              }
          }
          return secondMax;
    }
    public static boolean equal(List<Integer> arr){
        
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)!=arr.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
