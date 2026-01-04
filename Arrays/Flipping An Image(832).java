class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            int cols = image[i].length;

            for (int j = 0; j < cols / 2; j++) {
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][cols - j - 1] ^ 1;
                image[i][cols - j - 1] = temp;
            }

            // Handle middle element for odd-length rows
            if (cols % 2 == 1) {
                image[i][cols / 2] ^= 1;
            }
        }
        return image;
    }
}
