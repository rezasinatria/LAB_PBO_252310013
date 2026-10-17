package TugasB;



public class Spotify {
    public static void main(String[] args) {

        MediaAudio[] playlist = {
            new Lagu(),
            new Podcast()
        };

        for (MediaAudio media : playlist) {
            media.putarAudio();
        }
    }
}
