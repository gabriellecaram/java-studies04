package gabrielle.musicstreaming.templates;

import gabrielle.musicstreaming.templates.Audio;

public class Podcast extends Audio {

    private String host;
    private String description;
    private int releaseDate;

    public void showTechSpecifications(){
        System.out.println("Song Title: " + this.getName());
        System.out.println("Artist: " + getHost());
        System.out.println("Description: " + getDescription());
        System.out.println("Rate: " + this.getRate() + "/5 Plays: " + this.getPlays());
    }

    public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }
}
