package Arraypractice;

public class TransitionPoint {
    int[] arr= {0,0,0,0,1};
    int n= arr.length;




    public void transitionPoint()
    {
        for(int i=0; i<n; i++)
        {
            if(arr[i]==1)
            {
                System.out.println(i);
            }


        }
        System.out.println(-1);

    }
}

class Main1{
    public static void main(String[] args) {
        TransitionPoint trans = new TransitionPoint();
        trans.transitionPoint();
    }
}