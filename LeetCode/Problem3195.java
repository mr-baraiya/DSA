class Solution {
    public int minimumArea(int[][] grid) {
        int minRow = grid.length, maxRow = -1;
        int minCol = grid[0].length, maxCol = -1;
        for(int i=0 ; i<grid.length ; i++){
            for(int j=0 ; j<grid[0].length ; j++){
                if(grid[i][j] == 1){
                    if(i < minRow){
                        minRow = i;
                    }
                    if(i > maxRow){
                        maxRow = i;
                    }
                    if(j < minCol){
                        minCol = j;
                    }
                    if(j > maxCol){
                        maxCol = j;
                    }
                }
            }
        }

        if (maxRow == -1) return 0;
        
        int height = maxRow - minRow + 1;
        int width = maxCol - minCol + 1;
        return height * width;
    }
}
