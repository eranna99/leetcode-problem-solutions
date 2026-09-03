class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        // int nums2[] = new int[2];
        // int ev=0;
        // int od=0;
        // for(int i = 0; i < n ; i++ ){
        //      if(nums1[i]%2==0){
        //         ev++;
        //      }  
        //      else{
        //         od++;
        //      }

        // }
        // if((ev >0 )&& od>0) return false;
        // else return true;

        int minOdd = Integer.MAX_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int x : nums1) {
            if (x % 2 == 0) {
                minEven = Math.min(minEven, x);
            } else {
                minOdd = Math.min(minOdd, x);
            }
        }

        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        return minOdd < minEven;



        
    }
}