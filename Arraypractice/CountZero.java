package Arraypractice;

public class CountZero {
    int[] count2={1,1,1,1,1,1,0,0,0};
    int zero=0;

    public void findZero(){
        for (int i=0; i<count2.length; i++){
            if (count2[i]==0){
                zero++;
            }
        }
        System.out.println(zero);
    }
}

class Main9{
    public static void main(String[] args) {
        CountZero czero= new CountZero();
        czero.findZero();
    }
}
