package Arraypractice;

public class Rotate {
    int[] rotate={1,4,5,6,7};
    int x= 3;
    int y= rotate.length;

    public void printRotated(int[] arr, int x, int y){
        while(y>x){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]= temp;
            x++;
            y--;
        }

    }
    public void printSelection(int[] arr){

        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();

    }
}

class Main16{
    public static void main(String[] args) {
        Rotate rot= new Rotate();
        rot.printRotated(rot.rotate, rot.x, rot.y);
        rot.printSelection(rot.rotate);
    }
}