package Arraypractice;

import java.util.Arrays;

public class ZeroSort {
    int[] arr2={0,1,0,1,1,0,1};
int n= arr2.length;

    public void sortingZero(int[] arr){

       Arrays.sort(arr2);

    }

    public void printSort(int[] arr){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");

        }

    }
}

class Main10{
    public static void main(String[] args) {
        ZeroSort zero= new ZeroSort();
        zero.sortingZero(zero.arr2);
        zero.printSort(zero.arr2);

    }
}
