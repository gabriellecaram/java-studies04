package gabrielle.musicstreaming.templates;

public class Audio {
    private String name;
    private double rate;
    private int likes;
    private int plays;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getLikes() {
        return likes;
    }
    public void like(){
        this.likes++;
    }

    public int getPlays(){
        return plays;
    }
    public void plays(){
        this.plays++;
    }

}
