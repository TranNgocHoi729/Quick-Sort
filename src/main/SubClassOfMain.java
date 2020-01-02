/*
 * This class will suport main Class to sort an array.
 */
package main;

import com.xtel.SimpleSort.BubbleSort;
import com.xtel.SimpleSort.InsertionSort;
import com.xtel.SimpleSort.QuickSort;
import com.xtel.SimpleSort.SelectionSort;
import com.xtel.SimpleSort.SimpleSort;
import com.xtel.validateInput.ValidateInput;
import com.xtel.validateInput.ValidateInteger;

/**
 *
 * @author Tran Ngoc Hoi
 * @Create 26/12/2019
 */
public class SubClassOfMain implements SimpleSort {

    private ValidateInteger validate;
    private SimpleSort sort;
    private int[] inputArray;

    public SubClassOfMain(ValidateInteger validate) {
        this.validate = validate;
    }

    public static void menuOfSort() {
        System.out.println("1. Buble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Quick Sort");
        System.out.println("0. Exit");
    }

    @Override
    public void sort(int[] inputArray) {
        menuOfSort();
        System.out.println("Enter Sort Type : ");
        int sortNumber = validate.getPossitiveNumber(4);
        switch (sortNumber) {
            case 1:
                sort = new BubbleSort();
                sort.sort(inputArray);
                break;
            case 2:
                sort = new SelectionSort();
                sort.sort(inputArray);
                break;
            case 3:
                sort = new InsertionSort();
                sort.sort(inputArray);
                break;
            case 4 :
                sort = new QuickSort();
                sort.sort(inputArray);
                break;
            case 0:
                break;
        }
        
    }

}
