package day_05self;

import java.util.Arrays;

public class ChooseSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
