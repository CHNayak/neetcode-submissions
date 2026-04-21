class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;

        while(i<j){
            if(! Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(! Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                result = false;
                break;
            }
            else{
                i++;
                j--;
            }

        }

        return result;
    }
}
