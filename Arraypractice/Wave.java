//Write a program to  arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

package Arraypractice;

public class Wave {
    int[] wave1={1,2,3,4,5,6};
    int n= wave1.length;

    public void convertWave(){
        for (int i=1;i<n;i+=2){
            int temp=wave1[i];
            wave1[i]=wave1[i-1];
            wave1[i-1]= temp;
        }
    }
    public void printSelection(int[] arr){

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
}

class Main15{
    public static void main(String[] args) {
        Wave conwave= new Wave();
        conwave.convertWave();
        conwave.printSelection(conwave.wave1);
    }
}
