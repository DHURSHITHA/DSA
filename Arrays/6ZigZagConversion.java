class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int char_count=numRows+(numRows-2); //4
        //System.out.println(char_count);
        int total_cycle=s.length()/char_count;  //3
        //System.out.println(total_cycle);
        int rem=s.length()%char_count; //2
        //System.out.println(rem);
        int one_cycle=1+(numRows-2);//2
        //System.out.println(one_cycle);
        int col=one_cycle*total_cycle;//6
        //System.out.println(one_cycle);
        if(rem<=numRows) col+=1;
        else
        {
            col+=rem%numRows+1;
        }
        char[][] zig_zag = new char[numRows][col];
        for (int i = 0; i < numRows; i++) {
            Arrays.fill(zig_zag[i], '-');
        }

        int i=0;
        int row=-1;
        int cols=0;
        boolean flag = false;
        while(i<s.length())
        {
            if(row==numRows-1)
            {
                flag=true;
            }
            if(row<numRows&&flag==false)
            {
                row++;
                zig_zag[row][cols]=s.charAt(i++);
                //System.out.println(row+")"+cols);
            }
            else if(flag==true)
            {
                row-=1;
                cols+=1;
                zig_zag[row][cols]=s.charAt(i++);
                //System.out.println(row+"/"+cols);
                if(row==0)
                {
                    flag=false;
                }
            }
            else
            {
                flag=true;
                row-=2;
                cols+=1;
                zig_zag[row][cols]=s.charAt(i++);
                //System.out.println(row+"+"+cols);
            }
        }
        String res="";
        for(int r=0;r<numRows;r++)
        {
            for(int j=0;j<col;j++)
            {
                if(zig_zag[r][j]!='-')
                {
                    res+=zig_zag[r][j];
                }
            }
        }
        return res;

    }
}
