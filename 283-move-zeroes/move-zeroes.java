class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
       int zero=0;
       int count=0;
        if(n==0) return ;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }

        }
        for(int i=count;i<n;i++){
            nums[i]=zero;
        }
        
    }
}