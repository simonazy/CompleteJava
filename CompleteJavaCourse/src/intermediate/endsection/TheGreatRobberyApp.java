package intermediate.endsection;

public class TheGreatRobberyApp {
    public static void main(String[] args) {
        City city = new City();
        Gang gang = new Gang();
        Police police = new Police();
        gang.printGangInfo();

        do{
            gang.letsRob(city.getBuildings());
        } while (!police.catchCriminals(gang));
    }

}
