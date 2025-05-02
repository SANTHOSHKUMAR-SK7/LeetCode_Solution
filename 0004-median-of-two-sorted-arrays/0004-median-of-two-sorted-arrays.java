class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = merge(arr1,arr2);
        int mid = mergedArray.length / 2;
        if(mergedArray.length % 2 == 0){
            double res = ((mergedArray[mid - 1]  + mergedArray[mid]) / 2.0);
            return res;
        }
        else{
            return mergedArray[mid];
        }
    }
    static int[] merge(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0 ;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                res[k++] = arr1[i++];
            }
            else{
                res[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){
            res[k++] = arr1[i++];
        }
        while(j < arr2.length){
            res[k++] = arr2[j++];
        }
        return res;
    }
}