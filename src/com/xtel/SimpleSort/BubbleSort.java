
package com.xtel.SimpleSort;

/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class BubbleSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        int maxNumberInArray = inputArray[0];
        for (int j = inputArray.length - 1; j >= 0; j--) {
            for (int i = 0; i < j; i++) {
                if (inputArray[i + 1] < inputArray[i]) {
                    int swapVariable = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = swapVariable;
                }
                if (inputArray[i] > maxNumberInArray) {
                    maxNumberInArray = inputArray[i];
                }

            }
        }

    }

}
