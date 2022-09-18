package beginner.endsection;

public class IMDBApp {

    public static void main(String[] args) {
        String actorName = "Tom Cruise";
        int dob = 1962;
        int age = 2022 - dob;

        String[] movieNames = {"The Mummy", "Top Gun", "Mission Impossible", "American Made"};

        float[] movieScores = {7.0F, 9.5F, 8.7F, 5.6F};

        System.out.println("Actor's Name: " + actorName);
        System.out.println("Born: " + dob);
        System.out.println("Movies: ");

        for (int i=0; i<movieNames.length; i++){

            System.out.println(movieNames[i] + ": "+ getRate(movieScores[i]));

        }

    }

    public static String getRate(float score) {
        if (score < 8.0 && score >= 7.0) {
            return "Excellent";
        } else if (7.0 > score && score >= 5.0) {
            return "Average";
        } else if (score < 5.0) {
            return "Bad";
        } else {
            return "Amazing";
        }
    }
}