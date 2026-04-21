class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i,j;
        int count = 0;
        int maxcount = 0;

        HashSet<Character> uniqueChars = new HashSet<>();
        j = 0;

        for(i = 0; i < s.length(); i++){
            System.out.println("main=========  +  "+ s.charAt(i));

            if (uniqueChars.contains(s.charAt(i)) ){
                count = i - j ;
                while(s.charAt(j) != s.charAt(i) ){
                    uniqueChars.remove(s.charAt(j)); 
                    j = j+1;                   
                }
                j = j+1;
            maxcount =   Math.max(count, maxcount);
            System.out.println("in IF =========  +  "+ count + " value of maxcount " +maxcount + " j is  "+j);
            count = 0;

            }
            else{
                uniqueChars.add(s.charAt(i));
                count = count+1;
                System.out.println("in else =========  +  "+ count);
            }

        }
        
        return Math.max(maxcount, i-j);
    }
}
