class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> arr=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] current=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(current[1]>=intervals[i][0])
            {
                current[1]=Math.max(intervals[i][1],current[1]);
            }
            else
            {
                arr.add(current);
                current=intervals[i];
            }
        }
        arr.add(current);
        return arr.toArray(new int[arr.size()][]);
    }
}
