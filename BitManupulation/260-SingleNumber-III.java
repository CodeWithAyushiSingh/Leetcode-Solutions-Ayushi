class Solution {
    public int[] singleNumber(int[] nums) {
       int a=0;
        for(int i=0;i<nums.length;i++){
            a=a^nums[i];
        }
           int b=(a&(-a));
            int c=0; 
            int d=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i]&b)==0){
                    c=c^nums[i];
                }
                    else{
                    d=d^nums[i];
                }
            }
                return new int[]{c,d};
            }       
}
    
