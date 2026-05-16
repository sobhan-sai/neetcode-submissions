class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen= new HashSet<>();
        int longest =0;
        for(int n:nums){
            seen.add(n);
        }
        for(int it:seen){
            if(!seen.contains(it-1)){
                int count =1;
                int at = it;
                while(seen.contains(at+1)){
                    count=count+1;
                    at=at+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
