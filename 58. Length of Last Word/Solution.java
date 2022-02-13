class Solution {
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        
        if(s.isBlank()){
            return 0;
        }
        
        int n = str.length;
        int resultLength = str[n-1].length();
        
        
        return resultLength;
    }
}