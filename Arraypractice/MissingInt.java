package Arraypractice;

public class MissingInt {
    int[] b={1,3,4,2};
    int n= b.length;
    int total= (n)*(n+1)/2;
    int sum=0;

    public void findMissing(){

        for (int i = 0; i<n-1; i++){
            sum=sum+b[i];
            }
        System.out.println(total-sum);;
        }
    }


class Mains3{
    public static void main(String[] args) {
        MissingInt miss= new MissingInt();
        miss.findMissing();
    }
}
