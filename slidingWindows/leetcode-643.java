class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        double sum=0;
        double avg=0;

        while(i<k){
            sum = sum + nums[i];
            i++;
        }
        avg = sum/k;
        int j=k;
        i=j-k+1;
        while(j<nums.length){
            sum = sum - nums[i-1] + nums[j];
            i++;
            j++;
            double currentAvg = sum/k;
            avg = currentAvg > avg ? currentAvg : avg;
        }
        return avg;
    }
}