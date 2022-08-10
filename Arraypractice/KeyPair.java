package Arraypractice;

public class KeyPair {
    int[] key={2,3,4,5,6,1};
    int a =13;

    public void containKey(){
        for (int i=0; i<key.length; i++){
            for (int j=0; j<i; j++){
                if (key[i]+key[j]==13){
                    System.out.println("Yes");
                }
            }
        }
    }
}
class Main7{
    public static void main(String[] args) {
        KeyPair key= new KeyPair();
        key.containKey();
    }
}
