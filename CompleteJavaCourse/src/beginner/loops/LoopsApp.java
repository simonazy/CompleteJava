package beginner.loops;

public class LoopsApp {

    public static void main(String[] args){

        // for loop
        for(int k = 1; k<=5; k++) {
            if (k == 3) {
                break;
            }
            System.out.println((k + ". Being right sucks"));
        }
        System.out.println();

        // two loops
        for(int k=1; k<=2; k++){

            for(int l=1; l<=5; l++){
                System.out.println("k=" + k + " l=" + l + " Being right sucks");
            }
        }
        System.out.println();

        // while loop
        int i = 1;
        while(i<=0){
            System.out.println(i +". Being right sucks");
            i++;
        }
        System.out.println("Value of i: " + i);
        System.out.println();

        // do while
        int j = 1;
        do{
            System.out.println(j + ". BEING RIGHT SUCKS");
        }while(j<=0);
        System.out.println("Value of j: " + j);
        System.out.println();

    }

}
