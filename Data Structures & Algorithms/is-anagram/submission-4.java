class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sChar=s.toCharArray();
        Arrays.sort(sChar);
        char[] tChar=t.toCharArray();
        Arrays.sort(tChar);
        String sNew = new String(sChar);
        String tNew = new String(tChar);
        return sNew.equals(tNew);
    }
}
