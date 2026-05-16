class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> resultMap = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String u = new String(c);
            resultMap.computeIfAbsent(u, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(resultMap.values());
    }
}
