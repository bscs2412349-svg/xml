package xml;

import java.util.Arrays;

public class SelectionSort {

    static int[] selectionSort(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            int min = i;
            for(int j = i+1; j <arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
