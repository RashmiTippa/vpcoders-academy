package Arraypractice;

import java.util.Arrays;

public class Negative {
    int[] arr1={-1,5,8,-4,9,-2,-5};

    public void sortingNumber(int[] arr){

        Arrays.sort(arr1);

    }

    public void printSorted(int[] arr){
        int n= arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+ " ");

        }

    }
}

class Main13{
    public static void main(String[] args) {
        Negative nag= new Negative();
        nag.sortingNumber(nag.arr1);
        nag.printSorted(nag.arr1);
    }
}
