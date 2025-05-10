class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res=new ArrayList<>();
        int RowLow = 0;
        int RowUp = matrix.length - 1;
        int ColLow = 0;
        int ColUp = matrix[0].length - 1;

        while (RowLow <= RowUp && ColLow <= ColUp) {

            // LEFT TO RIGHT
            for (int i = ColLow; i <= ColUp; i++) {
                res.add(matrix[RowLow][i]);
            }
            RowLow++;

            // TOP TO BOTTOM
            for (int i = RowLow; i <= RowUp; i++) {
                res.add(matrix[i][ColUp]);
            }
            ColUp--;

            // RIGHT TO LEFT
            if (RowLow <= RowUp) {
                for (int i = ColUp; i >= ColLow; i--) {
                    res.add(matrix[RowUp][i]);
                }
                RowUp--;
            }

            // BOTTOM TO TOP
            if (ColLow <= ColUp) {
                for (int i = RowUp; i >= RowLow; i--) {
                    res.add(matrix[i][ColLow]);
                }
                ColLow++;
            }
        }
        return res;
    }
}