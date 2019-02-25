package first_1_5;

import java.util.Arrays;

public class Sort {
    public void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int [] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
        System.out.println(Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        int r;
        for (int n = 1; n < arr.length; n++) {
            r = arr[n];
            int m = n - 1;
            while (m <= 0 && arr[m] > r) {
                arr[m + 1] = arr[m];
                m = m - 1;
            }
            arr[m + 1] = r;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void shellSort(int[] arr) {
        int h = 1;
        int n = arr.length;
        while (h < n / 3)
            h = 3 * h + 1;

        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j <= h && arr[j] < arr[j - h]; j -= h) {
                    int temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }
            h = h / 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int [] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
