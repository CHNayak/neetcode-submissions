class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackName = new Stack<>();
        int i;
        boolean res = true;

        for(i = 0; i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stackName.push(s.charAt(i));
            }

            if(s.charAt(i) == ')'){
                if((!stackName.isEmpty()) && stackName.pop() == '('){

                }else{
                    res = false;
                    break;
                }
            }

            if(s.charAt(i) == '}'){
                if((!stackName.isEmpty()) && stackName.pop() == '{'){

                }else{
                    res = false;
                    break;
                }
            }

            if(s.charAt(i) == ']'){
                if((!stackName.isEmpty()) && stackName.pop() == '['){

                }else{
                    res = false;
                    break;
                }
            }


        }

        if(!stackName.isEmpty()){res = false;}

        return res;
    }
}
