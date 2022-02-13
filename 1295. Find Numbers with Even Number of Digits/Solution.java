import java.lang.*;
class Solution {
    public int findNumbers(int[] nums) {
        int evenCount= 0;
        
        for(int i=0;i<nums.length;i++){
            
            int length = 0;
            long temp = 1;
            while (temp <= nums[i]) {
                length++;
                temp *= 10;
            }
            
            if(length%2==0){
                evenCount++;
            }
        }
        
        return evenCount;
    }
}