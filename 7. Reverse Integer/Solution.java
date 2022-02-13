class Solution {
    public int reverse(int x) {
        if(x == 0 || x == Integer.MIN_VALUE){
         return 0;
     }
        long reversed = 0;
        while(x!=0){
            int digit = x%10;
            reversed = reversed*10+digit;
            x /=10;
            if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE){
            return 0;
        } 
        }
        
        return (int)reversed;
    }
}