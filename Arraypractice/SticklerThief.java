package Arraypractice;

public class SticklerThief {
    int[] house={5,5,10,100,10,5};
    int amt=0;

    public void maxAmt(){
        for (int i=0; i<house.length; i++){
            if (i % 2==1){
                amt=amt+house[i];

            }

        }

        System.out.println(amt);
    }
}

class Main5{
    public static void main(String[] args) {
        SticklerThief stickler=new SticklerThief();
        stickler.maxAmt();
    }

}
