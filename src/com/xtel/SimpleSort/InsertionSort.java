
package com.xtel.SimpleSort;

/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class InsertionSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        for (int i = 1; i < inputArray.length; i++) {
            for (int k = i; k >= 0; k--) {
                if (k == 0) {
                    break;
                } else if (inputArray[k] < inputArray[k - 1]) {
                    int swapVariable = inputArray[k];
                    inputArray[k] = inputArray[k - 1];
                    inputArray[k - 1] = swapVariable;
                } else {
                    break;
                }

            }

        }

    }

}
