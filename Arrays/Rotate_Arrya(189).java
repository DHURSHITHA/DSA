class Solution {
    void reverse(int start,int end,int[] nums)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
    public void rotate(int[] nums, int k) {
      k=k%nums.length;
      if(k==0) return;
      reverse(0,nums.length-1,nums);
      reverse(0,k-1,nums);
      reverse(k,nums.length-1,nums);
    }
}
