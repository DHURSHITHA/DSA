import java.util.Stack;

class Solution {
    void dfs(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return;

        Stack<int[]> stck = new Stack<>();
        stck.push(new int[]{sr, sc});
        image[sr][sc] = color;

        while (!stck.isEmpty()) {
            int[] arr = stck.pop();
            int r = arr[0], c = arr[1];

            // left
            if (c - 1 >= 0 && image[r][c - 1] == originalColor) {
                image[r][c - 1] = color;
                stck.push(new int[]{r, c - 1});
            }

            // up
            if (r - 1 >= 0 && image[r - 1][c] == originalColor) {
                image[r - 1][c] = color;
                stck.push(new int[]{r - 1, c});
            }

            // right
            if (c + 1 < image[0].length && image[r][c + 1] == originalColor) {
                image[r][c + 1] = color;
                stck.push(new int[]{r, c + 1});
            }

            // down
            if (r + 1 < image.length && image[r + 1][c] == originalColor) {
                image[r + 1][c] = color;
                stck.push(new int[]{r + 1, c});
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color);
        return image;
    }
}
