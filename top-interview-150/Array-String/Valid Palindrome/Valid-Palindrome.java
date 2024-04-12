class Solution {
    String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
    public boolean isPalindrome(String s) {
        // remove non-alphanumeric characters
        String clean = "";
        s = s.toLowerCase();
        for(char c : s.toCharArray()){
            if(alphabet.indexOf(c) != -1){
                clean += c;
            }
        }
        // check characters
        if(clean.length() != 0){
            for(int i = 0; i < (clean.length()/2) + 1; i++){
                if(clean.charAt(i) != clean.charAt((clean.length()-1)-i)){
                    return false;
                }
            }
        }
        return true;
    }
}