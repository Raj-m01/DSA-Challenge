class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start = 0;
        int end = matrix[start].length-1;
                
        while(start<matrix.length && end >= 0){
            
        if(target==matrix[start][end])
            return true;
        else
            if(target < matrix[start][end]){
            end--;
        }else
            if(target > matrix[start][end]){
            start++;
            }
            
            System.out.println(start+"  "+end);
        }
        
        return false;
    }
}