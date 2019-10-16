class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int index1 = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = index1; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    int temp = arr1[index1];
                    arr1[index1] = arr2[i];
                    arr1[j] = temp;
                    index1++;
                }
                
            }
            
        }
        
        //Sort rest of array 1 
        Arrays.sort(arr1, index1, arr1.length);
        return arr1; 
    }
}