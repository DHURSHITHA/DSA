class Solution {
    void bfs(int[][] grid,boolean[][] visited,int curr_row,int curr_col)
    {
        Queue<int[]> arr=new LinkedList<>();
        arr.add(new int[]{curr_row,curr_col});
        visited[curr_row][curr_col]=true;
        while(!arr.isEmpty())
        {
            int[] curr=arr.poll();
            int r=curr[0];
            int c=curr[1];
            int[][] dir={{-1,0},{0,1},{1,0},{0,-1}};
            for(int ind=0;ind<dir.length;ind++)
            {
                if(r+dir[ind][0]>=0&&r+dir[ind][0]<grid.length&&c+dir[ind][1]>=0&&c+dir[ind][1]<grid[0].length&&grid[r+dir[ind][0]][c+dir[ind][1]]==1&&!visited[r+dir[ind][0]][c+dir[ind][1]])
                {
                    visited[r+dir[ind][0]][c+dir[ind][1]]=true;
                    arr.add(new int[]{r+dir[ind][0],c+dir[ind][1]});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
      int count=0;
      int[][] mat=new int[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]=='1')
            mat[i][j]=1;
            else
            mat[i][j]=0;
        }
      }
      boolean[][] visited=new boolean[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++)
      {
        for(int j=0;j<grid[0].length;j++)
        {
            if(!visited[i][j]&&mat[i][j]==1)
            {
                count++;
                bfs(mat,visited,i,j);
            }
        }
      }
      return count;
    }
}
