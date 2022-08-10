package Arraypractice;

public class CountOddEven {
    int[] count1 ={2,3,4,5,6,7,8};
    int even=0;
    int odd=0;

    public void findOddEven(){
        for (int i = 0; i< count1.length; i++){
            if (i%2==0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println(even + " " + odd);
    }
}

class Main8{
    public static void main(String[] args) {
        CountOddEven count= new CountOddEven();
        count.findOddEven();
    }
}