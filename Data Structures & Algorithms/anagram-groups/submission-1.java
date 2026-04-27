class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        for(String s:strs){
            char[] sChar=s.toCharArray();
            Arrays.sort(sChar);
            String key=String.valueOf(sChar);
            resultMap.computeIfAbsent(key,k->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(resultMap.values());
    }
}
