class Solution {
    boolean func(char[][] board,int r,int c,boolean[][] visited,String word,int cur_ind)
    {
        if(cur_ind==word.length()) return true;
        int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};
        for(int ind=0;ind<dir.length;ind++)
        {
                if(r+dir[ind][0]<board.length&&r+dir[ind][0]>=0&&c+dir[ind][1]<board[0].length&&c+dir[ind][1]>=0&&!visited[r+dir[ind][0]][c+dir[ind][1]]&&board[r+dir[ind][0]][c+dir[ind][1]]==word.charAt(cur_ind))
                {
                    visited[r][c]=true;
                    boolean ret=func(board,r+dir[ind][0],c+dir[ind][1],visited,word,cur_ind+1);
                    if(ret==true) return true;
                    visited[r][c]=false;
                }
            }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean ret_val=func(board,i,j,visited,word,1);
                    if(ret_val==true) return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
        
    }
}
