package main;
import gabrielle.musicstreaming.templates.Music;
import gabrielle.musicstreaming.templates.Podcast;


public class Main {
    public static void main(String[] args) {

        Music vivaLaVida = new Music();
        vivaLaVida.setName("Viva La Vida");
        vivaLaVida.setSinger("Coldplay");
        vivaLaVida.setLength(4);
        vivaLaVida.setRate(5);
        for(int i=0; i<10; i++){
            vivaLaVida.plays();
        }
        for(int i=0; i<50; i++){
            vivaLaVida.like();
        }
        vivaLaVida.showTechSpecifications();

        System.out.println("\n--------");
        Podcast jovemNerd = new Podcast();
        jovemNerd.setName("Jovem Nerd");
        jovemNerd.setHost("Alexandre Ottoni");
        jovemNerd.setDescription("This podcast is about tech, comics, movies, and everything about the Nerd universe!");
        jovemNerd.setReleaseDate(2002);
        jovemNerd.setRate(4.5);
        jovemNerd.plays();
        jovemNerd.showTechSpecifications();
    }
}