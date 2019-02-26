package Lab2;

public class Province {
    private static final int DEFAULT_POPULATIONAL_MILLIONS = 4;
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private String name;
    private String capital;
    private int populationInMillions;
    private static String[][] cities = {{"Alberta","Edmonton"},{"British Columbia","Victoria"},
            {"Manitoba","Winnipeg"},{"New Brunswick","Fredericton",},{"Newfoundland and Labrador","St.John's"},
            {"Nova Scotia","Halifax"},{"Ontario","Toronta"},{"Prince Edward Island","Charlottetown"},
            {"Quebec","Quebec City"},{"Saskatchewan","Regina"}};
    private static int[]population = {4,4,1,1,1,1,13,0,8,1};

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        boolean ison = false;
        for(int row = 0;row < cities.length;row++) {
            if(name == cities[row][0]) {
                this.name = name;
                ison = true;
            }
        }
        return ison;
    }

    public String getCapital() {
        return capital;
    }

    public boolean setCapital(String capital) {
        boolean isin = false;
        for(int row = 0;row < cities.length;row++) {
                if(capital == cities[row][1]) {
                    this.capital = capital;
                    isin = true;
                }
        }
        return isin;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    public boolean setPopulationInMillions(int populationInMillions) {
        boolean isin = false;
        if(populationInMillions >= 0 & populationInMillions <= 38) {
            this.populationInMillions = populationInMillions;
            isin = true;
        }
        return isin;
    }

    public Province(String name,String capital,int populationInMillions) {
        if(!setCapital(capital) || !setName(name) || !setPopulationInMillions(populationInMillions)) {
            this.capital = DEFAULT_CAPITAL;
            this.name = DEFAULT_PROVINCE;
            this.populationInMillions = DEFAULT_POPULATIONAL_MILLIONS;
        }
    }

    public String getDetails() {
        String details = String.format("The capital of %s (pop. %d million) is %s.", getName(), getPopulationInMillions(), getCapital());
        return details;
    }
}
