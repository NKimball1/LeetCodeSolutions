import java.util.*;

class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                //Shift other elements 1 index forward
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                
                //Make i + 1 0
                arr[i + 1] = 0;
                i++;
             }
        }
    }
}