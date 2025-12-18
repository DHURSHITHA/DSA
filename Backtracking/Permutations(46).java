class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,new ArrayList<>(),new boolean[nums.length],result);
        return result;
    }
    public void backtrack(int[] nums,List<Integer> current,boolean[] check,List<List<Integer>> result)
    {
        if(current.size()==nums.length)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(check[i]) continue;
            check[i]=true;
            current.add(nums[i]);
            backtrack(nums,current,check,result);
            check[i]=false;
            current.remove(current.size()-1);
        }
    }
}
