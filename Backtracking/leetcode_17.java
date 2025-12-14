class Solution {
    void func(List<String> ans,StringBuilder working_str,List<String> alpha,String digits,int index,int[] arr)
    {
        if(index>=digits.length())
        {
            ans.add(working_str.toString());
            return;
        }
        String temp=alpha.get(arr[index]-2);
        for(int i=0;i<temp.length();i++)
        {
            working_str.append(temp.charAt(i));
            //System.out.println(working_str);
            func(ans,working_str,alpha,digits,index+1,arr);
            working_str.deleteCharAt(working_str.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        int[] arr=new int[digits.length()];
        for(int i=0;i<digits.length();i++)
        {
            arr[i]=digits.charAt(i)-'0';
            //System.out.println(arr[i]);
        }
        List<String> alpha=new ArrayList<>();
        alpha.add("abc");
        alpha.add("def");
        alpha.add("ghi");
        alpha.add("jkl");
        alpha.add("mno");
        alpha.add("pqrs");
        alpha.add("tuv");
        alpha.add("wxyz");
        List<String> ans=new ArrayList<>();
        String start=alpha.get(arr[0]-2);
        for(int i=0;i<start.length();i++)
        {
            StringBuilder temp=new StringBuilder();
            temp.append(start.charAt(i));
            func(ans,temp,alpha,digits,1,arr);
        }
        return ans;
    }
}
