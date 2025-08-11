class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int size) {
        int layers = size / 2; // Number of layers
        int height = size;     // Height of current layer

        for (int layer = 0; layer < layers; layer++) {
            int col = y;
            for (int b = 0; b < size; b++) {
                int temp = grid[x][col];
                grid[x][col] = grid[x + height - 1][col];
                grid[x + height - 1][col] = temp;
                col++;
            }
            x++;          // Move one row down (inner layer)
            height -= 2;  // Shrink height for next layer
        }
        return grid;
    }
}
