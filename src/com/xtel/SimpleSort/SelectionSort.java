
package com.xtel.SimpleSort;

/**
 * @author Tran Ngoc Hoi 
 * Create at : 26/12/2019
 */
public class SelectionSort implements SimpleSort {

    @Override
    public void sort(int[] inputArray) {
        if (inputArray.length <= 1 || inputArray == null) {
            return;
        }
        for (int i = inputArray.length - 1; i >= 0; i--) {
            int IndexOfMaxVariableInArray = i;
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[IndexOfMaxVariableInArray]) {
                    IndexOfMaxVariableInArray = j;
                }
            }
            int swapVariable = inputArray[i];
            inputArray[i] = inputArray[IndexOfMaxVariableInArray];
            inputArray[IndexOfMaxVariableInArray] = swapVariable;
        }
    }

}
