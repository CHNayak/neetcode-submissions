class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> str = new HashMap<>();
        int i,j;
        boolean res = true;

        for(i = 0; i< s.length();i++){
            if(str.containsKey(s.charAt(i))){
                str.put(s.charAt(i),str.get(s.charAt(i))+1);
            }else{
                str.put(s.charAt(i),1);
            }
        }

        for(i = 0;i< t.length();i++){
            if(str.containsKey(t.charAt(i))){
                if(str.get(t.charAt(i)) == 1){
                    j = str.remove(t.charAt(i));
                }else{
                   str.put(t.charAt(i),str.get(t.charAt(i))-1);
                }

            }else{
                res = false;
                break;
            }
        }

        if(!str.isEmpty()){res = false;}


        return res;

    }
}
