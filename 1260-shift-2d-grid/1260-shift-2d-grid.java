class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        List<List<Integer>>ans = new ArrayList<>();
        int[][] mat = new int[grid.length][grid[0].length];
        System.out.println(grid.length);
        System.out.println(grid[0].length);

        for(int i = 0; i < k; i++){

            for(int row = 0; row < grid.length; row++){
                for(int col = 0; col < grid[0].length; col++){
                    if(col != grid[0].length-1){
                        mat[row][col+1] = grid[row][col];
                    }else{
                        if(row == 0)
                        mat[row][0] = grid[grid.length-1][col];
                        else{
                            mat[row][0] = grid[row-1][col];
                        }
                    }
                }
            }
            for(int row = 0; row < grid.length; row++){
                for(int col = 0; col < grid[0].length; col++){
                    grid[row][col] = mat[row][col];
                }
            }
        }
        for(int row = 0; row < grid.length; row++){
            List<Integer>rowValue = new ArrayList<>();
                for(int col = 0; col < grid[0].length; col++){
                    rowValue.add(grid[row][col]);
                }
                ans.add(rowValue);
        }
        return ans;
    }
}