package Arraypractice;

public class Concatanate {
    int[] num={1,2,3};

    public  void  getConcatenation(int[] nums) {
        int[] arr=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }

    }
    public void printSelection(int[] arr){

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
}

class Main17{
    public static void main(String[] args) {
        Concatanate concate=new Concatanate();
        concate.getConcatenation(concate.num);
        concate.printSelection(concate.num);
    }
}