package intermediate.abstraction.athlete;

public class Swimmer extends Athlete implements Swimming{
    private int finalPoints;

    public Swimmer(String name, String nickname, int yearOfBorn, String team, int numberOfCompetitions, int finalPoints){
        super(name, nickname, yearOfBorn, team, numberOfCompetitions);
        this.finalPoints = finalPoints;
    }

    @Override
    public void getBio(){
        super.getBio();
        System.out.println("FINAL points: " + finalPoints);
    }

    @Override
    public String getBodyType() {
        return null;
    }

    @Override
    public void freestyle(){
        System.out.println("Swimming freestyle very fast.");
    }

    @Override
    public void compete(){
        super.compete();
        freestyle();
    }
}
