class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(resultMap.containsKey(diff)){
                return new int[]{resultMap.get(diff),i};
            }
            resultMap.put(nums[i],i);
        }
        return new int[2];
    }
}
