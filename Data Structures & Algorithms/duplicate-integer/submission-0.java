class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> setName = new HashSet<>();

        int i = 0;
        boolean res = false;

        while(i < nums.length){
            if(!setName.contains(nums[i])){
                setName.add(nums[i]);
                i++;
            }else
            {
                res = true;
                break;
            }
        }

        return res;
    }
}