package advanced.arrayFunctions;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayFunctionsApp {
    public static void main(String[] args) {
        int[] gamePoints = new int[12];
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("All players start with 200 points.");
        Arrays.fill(gamePoints, 200);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The first 10 players lost 20 points.");
        Arrays.fill(gamePoints, 0, 10, 180);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The 10th player gained 50 points");
        gamePoints[9] += 50;
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The gamer points in order");
        Arrays.sort(gamePoints);
        System.out.println(Arrays.toString(gamePoints));

        System.out.println("The top 5 points");
        int[] lastFivePoints = Arrays.copyOf(gamePoints, 5);
        System.out.println(Arrays.toString(lastFivePoints));

        System.out.println("The last 5 points");
        int[] topFivePoints = Arrays.copyOfRange(gamePoints, gamePoints.length - 5,gamePoints.length);
        System.out.println(Arrays.toString(topFivePoints));

        if(Arrays.equals(lastFivePoints, topFivePoints)){
            System.out.println("The top 5 players have the same points as the last 5 players.");
        }else{
            System.out.println("The top 5 players don't have the same points as the last 5 players.");
        }

        gamePoints[4] = 300;
        Arrays.sort(gamePoints);
        //System.out.println(Arrays.toString(gamePoints));
        if(Arrays.binarySearch(gamePoints, 300)>=0){
            System.out.println("Someone reached 300 points. The game is over!");
        } else {
            System.out.println("There is nobody who reached 300 points yet.");
        }
    }
}
