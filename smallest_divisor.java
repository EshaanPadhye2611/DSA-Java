class Solution {
    public int smallestDivisor(int[] nums, int threshold) {


        int start = 1;
        int end = getMax(nums);
        int num = Integer.MAX_VALUE;

        while(start <= end){
            int mid  = start  + (end  - start) / 2;
            int sum =0;

            for(int i=0;i<nums.length;i++){
                int result  = (nums[i] + mid - 1) / mid;
                sum  = sum + result;
            }
            if(sum <= threshold){
                num = Math.min(num,mid);
                end = mid - 1;
               
            }
            if(sum > threshold){
                start = mid  + 1;
            }
            
        }
        
        return num;
    }
    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num; 
            }
        }
        return max;

}
}