class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] words = S.split("\\.");
        
        StringBuilder reversed = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            reversed.append(words[i]);
            if(i!=0){
                reversed.append(".");
            }
        }
    
        return reversed.toString();
    }
}