class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        int i;
        int pr;

        prefix[0] = 1;        
        suffix[nums.length -1] = 1;

        pr = nums[0];
        for(i=1;i < nums.length ; i++){
            prefix[i] = pr;
            pr = pr * nums[i];
        }

        pr = nums[nums.length -1];
        for(i = nums.length - 2; i >= 0 ; i-- ){
            suffix[i] = pr;
            pr = pr * nums[i];
        }
        
        for(i = 0; i < nums.length ;i++){
            result[i] = prefix[i] * suffix[i];

        }

        return result;
    }
}  
