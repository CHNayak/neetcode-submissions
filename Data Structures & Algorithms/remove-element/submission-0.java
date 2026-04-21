class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        int k = 0;
        int temp;

        while(start <= end){
            if(nums[start] != val){
                start = start + 1;
                k = k + 1;
            }
            else{
                temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                end = end -1;
            }

        }

        return k;
    }
}