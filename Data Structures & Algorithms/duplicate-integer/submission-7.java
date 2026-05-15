class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> res = new HashSet<>();
        for(int i :nums){
            if(!res.add(i)){
                return true;
            }
        }
        return false;
    }
}