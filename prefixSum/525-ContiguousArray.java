class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum=0;
        int longestSubArray= 0;
        for(int i=0; i<nums.length; i++){
            sum = nums[i]==0 ?sum -1: sum+ 1;

            int length=0;
            if(sum==0){
                length=i+1;
                longestSubArray = longestSubArray>length?longestSubArray:length;
            }else if(map.containsKey(sum)){
                length = i-map.get(sum);
                longestSubArray = longestSubArray>length?longestSubArray:length;
            }else{
                map.put(sum,i);
            }
            
        }
        return longestSubArray;
    }
}