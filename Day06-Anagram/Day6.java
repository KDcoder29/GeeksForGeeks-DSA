class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
     int[] arr = new int[26];
     
     for(int i=0;i<a.length();i++){
         char c = a.charAt(i);
         arr[c-'a']++;
     }
     
     for(int i=0;i<b.length();i++){
         char c = b.charAt(i);
         arr[c-'a']--;
     }
     
     for(int i=0;i<arr.length;i++){
         if(arr[i]!=0){
             return false;
         }
     }
     return true;

    }
}
