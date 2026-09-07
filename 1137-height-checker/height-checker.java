class Solution {
    public int heightChecker(int[] heights) {
        int n  = heights.length;
        int count=0;
        int[] arr1 =heights.clone();
        Arrays.sort(arr1);


        for(int i = 0 ; i<= n-1;i++){
            // for(int j = 0;j<=i;j++ ){
                if(arr1[i] != heights[i]){
                    count++;
                }
            
        }


        return count;

    }
}