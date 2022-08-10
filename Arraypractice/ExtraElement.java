package Arraypractice;

public class ExtraElement {
    int[] a={2,3,4,5,6,7,8};
    int[] b={2,3,4,6,7,8};

    public void findExtra(){
        for (int i=0; i<a.length; i++){
            if (a[i]!=b[i]){
                System.out.println("this is the first missing index: " + i);
                break;

           }

        }
    }
}

class Main{
    public static void main(String[] args) {
        ExtraElement extra= new ExtraElement();
        extra.findExtra();
    }
}
