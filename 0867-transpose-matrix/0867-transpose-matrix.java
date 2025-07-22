class Solution {
    public int[][] transpose(int[][] matrix) {
        int Rlen = matrix.length;
        int Clen= matrix[0].length;
        int[][] newMatrix = new int[Clen][Rlen];
        for(int i =0 ; i < Rlen ; i++){
            for (int j =0 ; j < Clen ; j++){
                newMatrix[j][i]=matrix[i][j];
            }
            
        }
        return newMatrix;
    }
}