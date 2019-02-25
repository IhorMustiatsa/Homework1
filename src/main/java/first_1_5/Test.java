package first_1_5;

import org.apache.commons.lang.time.StopWatch;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int [] arr = new int [10000];
        for (int n = 0; n<10000;n++){
            arr[n]=(int)(Math.random()*arr.length);
        }
        StopWatch timer1 = new StopWatch();
        StopWatch timer2 = new StopWatch();
        StopWatch timer3 = new StopWatch();
        StopWatch timer4 = new StopWatch();
        StopWatch timer5 = new StopWatch();
        timer1.start();
        sort.selectionSort(arr);
        timer1.stop();
        System.out.println(timer1.getTime());
        timer2.start();
        sort.quickSort(arr);
        timer2.stop();
        System.out.println(timer2.getTime());
        timer3.start();
        sort.shellSort(arr);
        timer3.stop();
        System.out.println(timer3.getTime());
        timer4.start();
        sort.insertionSort(arr);
        timer4.stop();
        System.out.println(timer4.getTime());
        timer5.start();
        sort.bubbleSort(arr);
        timer5.stop();
        System.out.println(timer5.getTime());


    }

}
