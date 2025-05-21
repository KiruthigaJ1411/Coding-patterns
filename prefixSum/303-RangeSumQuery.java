class NumArray {
    int[] numArray;

    public NumArray(int[] nums) {
        for(int i=1; i<nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        this.numArray=nums;
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return this.numArray[right];
        }
        return this.numArray[right] - this.numArray[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */