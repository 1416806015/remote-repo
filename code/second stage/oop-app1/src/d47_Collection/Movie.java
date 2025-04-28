package d47_Collection;

public class Movie {
    private String name;
    private double socre;
    private String actor;


    public Movie() {
    }

    public Movie(String name, double socre, String actor) {
        this.name = name;
        this.socre = socre;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSocre() {
        return socre;
    }

    public void setSocre(double socre) {
        this.socre = socre;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", socre=" + socre +
                ", actor='" + actor + '\'' +
                '}';
    }
}
