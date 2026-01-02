class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> arr=new HashSet<>();
        for(int num:nums)
        {
            if(arr.contains(num))
            {
                return num;
            }
            else
            {
                arr.add(num);
            }
        }
        return -1;
    }
}
