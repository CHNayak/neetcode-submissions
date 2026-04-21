class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length - 1;
        int i = 0;
        int k = 1;
        int current = 0;
        int next = 1;
        int j;
        int orig = len;

        while(next <= len){
           // System.out.println(Arrays.toString(nums));
            if(nums[current] == nums[next]){
                
                for(j = next;j < len ;j++){
                    nums[j] = nums[j+1];

                }
              //  next = next + 1;
              len = len -1;
                continue;
            }
            if(nums[current] > nums[next]){
                break;
            }
            if(nums[current] < nums[next]){
                k = k+1;
                
                current = next;
                next = next+1;
            }

        }

        if(next + 1 <= orig ){
            if(nums[next] < nums[next+1]){
                k = k+1;
            }
        }

        return k;


    }
}