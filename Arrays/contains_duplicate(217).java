class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> arr=new HashSet<>();
        for(int num:nums)
        {
            if(arr.contains(num))
            {
                return true;
            }
            else
            {
                arr.add(num);
            }
        }
        return false;
    }
}
