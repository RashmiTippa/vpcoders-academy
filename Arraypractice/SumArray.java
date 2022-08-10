package Arraypractice;

public class SumArray {
    int[] array={4,5,6,7,3,5};
    int sum=0;

    public void findSum(){
        for (int i=0; i< array.length; i++){
            sum=sum+array[i];
        }
        System.out.println("This is the sum of array given: "+ sum);
    }
}

class Main6{
    public static void main(String[] args) {
        SumArray sum= new SumArray();
        sum.findSum();
    }
}