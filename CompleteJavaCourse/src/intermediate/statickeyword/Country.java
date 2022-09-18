package intermediate.statickeyword;

public class Country {
    // static(class) variable is initialized with the class, and they belong to the class not a particular instance;
    private static int numberOfCountries;
    private final String NAME;
    private int population;
    private String capital;

    // variable initialization in sequence;
    static {
        numberOfCountries = 5;
    }
    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries ++;
    }

    public final void populationChange(int change){
        population+=change;
    }
    public void getDetails(){
        System.out.println("Country name: " + NAME + " Population: " + population + " Capital: " + capital);
    }

    public static int getNumberOfCountries(){
        return numberOfCountries;
    }

//    static {
//        numberOfCountries = 0;
//    }
}
