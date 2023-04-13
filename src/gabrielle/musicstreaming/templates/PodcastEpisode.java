package gabrielle.musicstreaming.templates;

public class PodcastEpisode {
    private Podcast podcast;
    private int number;
    private int length;


    public Podcast getPodcast() {
        return podcast;
    }
    public void setPodcast(Podcast podcast) {
        this.podcast = podcast;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
