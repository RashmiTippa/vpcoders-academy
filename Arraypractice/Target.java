package Arraypractice;

public class Target {
    int[] arr1={1,2,3,4,5};
    int a= 5;


    public void findTarget(){
        for (int i=0; i< arr1.length; i++){
            for (int j=0; j<i; j++){
                if (arr1[i]+arr1[j]==a){
                    System.out.println(j + " " + i);
                }
            }
        }
    }
}

class Mains2{
    public static void main(String[] args) {
        Target tar=new Target();
        tar.findTarget();
    }
}