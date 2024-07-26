class Solution {
    boolean kPangram(String str, int k) {
        // code here
        str=str.replaceAll(" ","");
        str=str.replaceAll("[^a-zA-z0-9]","");
        if(str.length()<26) return false;
        
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<str.length();i++){
            hs.add(str.charAt(i));
        }
        if(k>=26-hs.size()){
            return true;
        }else{
            return false;
        }
            
        
    }
}
