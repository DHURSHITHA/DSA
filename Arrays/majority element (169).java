class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int i,pro=1;
        for(i=0;i<nums.length;i++)
        {
            arr[i]=pro;
            pro*=nums[i];
        }
        int pro2=1;
        for(i=nums.length-1;i>=0;i--)
        {
            arr[i]=arr[i]*pro2;
            pro2*=nums[i];
        }
        return arr;
        
    }
}
