class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
        int start = 0;
        int end = s.length()-1;
        char currentLetterFromStart = ' ';
        char currentLetterFromEnd = ' ';
        while(start <= end){
            currentLetterFromStart = s.charAt(start);
            currentLetterFromEnd = s.charAt(end);
            if(!Character.isLetterOrDigit(currentLetterFromStart)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currentLetterFromEnd)){
                end--;
            }
            // Check if equal
            else{
                if(currentLetterFromStart != currentLetterFromEnd){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}