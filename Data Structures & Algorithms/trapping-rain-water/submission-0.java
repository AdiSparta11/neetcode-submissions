class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left =0;
        int right =n-1;
        int maxLeft = height[0];
        int maxRight = height[n-1];
        int result = 0;
        while(left<right){
            if(maxLeft<maxRight){
                left++;
                maxLeft = Math.max(maxLeft,height[left]);
                result += maxLeft-height[left];
            }else{
                right--;
                maxRight = Math.max(maxRight, height[right]);
                result += maxRight-height[right];
            }
        }
        return result;
    }
}
