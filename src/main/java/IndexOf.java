
//

public class IndexOf {
    /**
     * Find the position of a number in an array.
     * For example, the position of 7 in {0,1,7,3,4} is 2.
     *
     * @param arr an int array.
     * @param n a possible value of arr.
     * @return the first index (position) of n in arr. if n does not exist in arr, return -1.
     */
    public int getIndex(int[] arr, int n){
        int len = arr.length;
        int i = 0;
        while(i< len){
            if(arr[i] == n){
                return i;
            }else{
                i +=1;
            }
        }
        return -1;
    }
}
