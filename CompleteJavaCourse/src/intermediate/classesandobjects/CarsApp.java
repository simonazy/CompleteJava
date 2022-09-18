package intermediate.classesandobjects;

public class CarsApp {

    public static void main(String[] args) {

        DodgerChallenger redDodgeChallenger = new DodgerChallenger("red", (byte) 3, (short) 450, (short) 717, (short) 7700, 40000, 1500, true);
        redDodgeChallenger.startTheEngine();
        redDodgeChallenger.getDescription();

        System.out.println("----------------------------------------------");
        DodgerChallenger orangeDodgeChallenger = new DodgerChallenger("orange", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

    }
}
