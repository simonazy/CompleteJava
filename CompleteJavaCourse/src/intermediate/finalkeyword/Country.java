package intermediate.finalkeyword;

public class Country {
    // final variable: to create constant variable
    private final String name;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }
    // final method: prevent method override
    public final void populationChange(int change){
        population += change;
    }
}
