class Solution {
    public int[] twoSum(int[] nums, int target) {

        Hashtable<Integer, Integer> Ref = new Hashtable<Integer, Integer>();
        int i;
        int[] output = new int[2];

        for(i = 0; i< nums.length ; i++){
            if (Ref.containsKey(target - nums[i])){
                output[0] = Ref.get(target - nums[i]);
                output[1] = i;
                break;
            }
            else{
                Ref.put( nums[i],i);
            }
        }
       return output ;
    }
}
