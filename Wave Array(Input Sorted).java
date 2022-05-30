class Solution {
    public static void convertToWave(int n, int[] a) {
        for(int i = 0; i < a.length - 1; i= i + 2){
            swap(i, i+1, a);
        }
    }
    
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
 
