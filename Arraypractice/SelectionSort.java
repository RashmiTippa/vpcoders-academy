package Arraypractice;

public class SelectionSort {
    int[] arr= new int[5];
    int n= arr.length;

    public void selectionSort(int[] arr){
        for (int i=0; i<n-1;i++){
            int min_ind=i;
            for (int j=1; j<n;j++){
                if (arr[j]<arr[min_ind]){
                    min_ind=j;
                    int temp=arr[min_ind];
                    arr[min_ind]=arr[j];
                    arr[j]=temp;

                }
            }
        }
    }

    public void printSelection(int[] arr){

            int n = arr.length;
            for (int i=0; i<n; ++i)
                System.out.print(arr[i]+" ");
            System.out.println();

    }
}

class Main12{
    public static void main(String[] args) {
        SelectionSort selection=new SelectionSort();
        int arr[]={3,7,5,9,10};
        selection.selectionSort(arr);
        selection.printSelection(arr);
    }
}