package gabrielle.musicstreaming.templates;

import gabrielle.musicstreaming.templates.Audio;

public class Music extends Audio {

    private String singer;
    private int length;

    public void showTechSpecifications(){
        System.out.println("Song Title: " + this.getName());
        System.out.println("Artist: " + singer);
        System.out.println("Length: " + length);
        System.out.println("Rate: " + this.getRate() + "/5 Plays: " + this.getPlays());
        System.out.println("Likes: " + getLikes());
    }

    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
}
