package assign2;

public class Musician {

    public static final String drums = "\uD83E\uDD41";
    public static final String guitar = "\uD83C\uDFB8";
    public static final String microphone = "\uD83C\uDFA4";

    private static final int defaultNumberOfKnownSongs = 3;
    private String name;
    private Song[] knownSongs;
    private int numKnownSongs;


    public Musician(String name, int numOfSongs) {
        this.name = name;
        knownSongs = new Song[numOfSongs];
        numKnownSongs = 0;
    }


    public Musician(String name) {
        this(name, defaultNumberOfKnownSongs);
    }


    public Song[] getKnownSongs(){
        return  knownSongs;
    }
    public boolean learnSong(Song song) {
        if (numKnownSongs >= knownSongs.length) {
            return false;
        }
        knownSongs[numKnownSongs++] = song;
        return true;
    }

    public void playAllKnownSongs() {
        for (int i = 0; i < numKnownSongs; i++) {
            playSong(knownSongs[i]);
        }
    }

    public String toString() {
        return "My name is " + name + " and I know " + numKnownSongs + " song" + (numKnownSongs == 1 ? "." : "s.");
    }


    public boolean playSong(Song song) {
        for (int i = 0; i < numKnownSongs; i++) {
            if (song.equals(knownSongs[i])) {
                System.out.println(name + " plays " + song.toString());
                return true;
            }
        }
        System.out.println(name + " does not know " + song.toString());
        return false;
    }

    public static void main(String args[]) {
        System.out.println(drums);
        System.out.println(guitar);
        System.out.println(microphone);

    }

    //Start Here
    public int toNumKnownSongs() {
        return this.numKnownSongs;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setNumKnownSongs(int numKnownSongs){
        this.numKnownSongs=numKnownSongs;
    }
    public int getNumKnownSongs(){
        return numKnownSongs;

    }
    public Song getSongAtIndex(int Index) {
        if (this.knownSongs[Index]== (null)) {
            return null;
        }
        if (Index > this.knownSongs.length )
            return null;

        if (Index < 0) {
            return null;
        }
            return knownSongs[Index];
    }
}










