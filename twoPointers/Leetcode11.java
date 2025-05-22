class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        int max=0;
        while(left<right){
            int product =0;
            if(height[left] < height[right]){
                product = height[left] * (right - left);
                left++;
            } else{
                product = height[right] * (right - left);
                right--;
            }
            max = max>product?max:product;
        }
        return max;
    }
}