class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][] result = new int[m][n];
        
        // Identify the layers
        int numLayers = Math.min(m, n) / 2;
        
        // Perform k cyclic rotations on each layer
        for (int layer = 0; layer < numLayers; layer++) {
            int numRows = m - layer * 2;
            int numCols = n - layer * 2;
            int[] layerValues = new int[2 * (numRows + numCols - 2)];
            
            // Store the values of the layer in a 1D array
            int index = 0;
            for (int i = layer; i < layer + numRows; i++) {
                layerValues[index++] = grid[i][layer];
            }
            for (int j = layer + 1; j < layer + numCols; j++) {
                layerValues[index++] = grid[layer + numRows - 1][j];
            }
            for (int i = layer + numRows - 2; i >= layer; i--) {
                layerValues[index++] = grid[i][layer + numCols - 1];
            }
            for (int j = layer + numCols - 2; j > layer; j--) {
                layerValues[index++] = grid[layer][j];
            }
            
            // Perform k cyclic rotations on the layer values
            int rotateBy = k % layerValues.length;
            int[] rotatedLayerValues = new int[layerValues.length];
            for (int i = 0; i < layerValues.length; i++) {
                rotatedLayerValues[(i + rotateBy) % layerValues.length] = layerValues[i];
            }
            
            // Update the values in the result matrix
            index = 0;
            for (int i = layer; i < layer + numRows; i++) {
                result[i][layer] = rotatedLayerValues[index++];
            }
            for (int j = layer + 1; j < layer + numCols; j++) {
                result[layer + numRows - 1][j] = rotatedLayerValues[index++];
            }
            for (int i = layer + numRows - 2; i >= layer; i--) {
                result[i][layer + numCols - 1] = rotatedLayerValues[index++];
            }
            for (int j = layer + numCols - 2; j > layer; j--) {
                result[layer][j] = rotatedLayerValues[index++];
            }
        }
        
        return result;
    }
}