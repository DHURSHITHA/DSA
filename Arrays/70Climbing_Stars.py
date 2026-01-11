class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        ans=[0]*(n+2)
        ans[1]=1
        if n==0:
            return ans[0]
        elif n==1:
            return ans[1]
        for i in range(2,len(ans)):
            ans[i]=ans[i-1]+ans[i-2]
        return ans[n+1]
        
