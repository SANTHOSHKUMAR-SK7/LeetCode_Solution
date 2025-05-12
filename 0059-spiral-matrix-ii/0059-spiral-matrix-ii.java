class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        geArrFull(1,arr, 0, arr.length-1, 0 ,arr[0].length-1);
        return arr;
    }
    static void geArrFull(int i,int[][] arr,int rs,int re,int cs,int ce){
        if(rs > re || cs > ce){
            return;
        }

        //top
        for(int k = cs; k <= ce;k++){
            arr[rs][k] = i++;
        }
        rs++;

        //rigth
        for(int k = rs ; k <= re;k++){
            arr[k][ce] = i++;
        }
        ce--;

        //down
        if(rs <= re){
            for(int k = ce ; k >= cs;k--){
                arr[re][k] = i++;
            }
            re--;
        }

        //left
        if(cs <= ce){
            for(int k = re;k >= rs;k--){
                arr[k][cs] = i++;
            }
            cs++;
        }
        geArrFull(i,arr,rs,re,cs,ce);
    }
}