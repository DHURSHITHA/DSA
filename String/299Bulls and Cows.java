class Solution {
    public String getHint(String secret, String guess) {
        int[] arr=new int[10];
        int matches=0;
        String res="";
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i)==guess.charAt(i))
            {
                matches++;
            }
            arr[secret.charAt(i)-'0']++;
        }
        int count=0;
        for(int i=0;i<guess.length();i++)
        {
            if(arr[guess.charAt(i)-'0']!=0)
            {
                count++;
                arr[guess.charAt(i)-'0']-=1;
            }
        }
        res+=Integer.toString(matches);
        res+="A";
        res+=Integer.toString(count-matches);
        res+='B';
        return res;
        
    }
}
