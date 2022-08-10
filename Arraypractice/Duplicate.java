package Arraypractice;

public class Duplicate {
    int[] arra={2,3,4,1,2};

    public void findDuplicate(){
        for (int i=0; i< arra.length; i++){
            for (int j=i+1; j< arra.length; j++){
                if (arra[i]==arra[j]){
                    System.out.println(arra[j]);

                }
            }

        }
    }
}

class Mains4{
    public static void main(String[] args) {
        Duplicate dup= new Duplicate();
        dup.findDuplicate();
    }
}
