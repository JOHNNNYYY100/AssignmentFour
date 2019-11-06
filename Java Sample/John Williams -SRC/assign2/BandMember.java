package assign2;

public class BandMember extends Musician {
    public BandMember(String name, int numOfSongs){
        super(name,numOfSongs);

    }
    public BandMember(String name){
        super (name);
    }

    public boolean knowsSong(Song song) {
        for (int i = 0; i <= this.getKnownSongs().length; i++)
            if (this.getKnownSongs()[i].equals(song)) {
                return true;
            }
        return false;

    }

    public boolean canLearnNewSong(Song song) {
        for (int i = 0; i < this.getNumKnownSongs(); i++) {
            if (this.getKnownSongs()[i].equals(song) || (this.getKnownSongs()[i].equals(null))) {
                return true;
            }
        }
        return false;

    }
    @Override
    public boolean learnSong(Song song){
        if(canLearnNewSong(song)){
            for(int i=0; i < this.getKnownSongs().length; i++){
                if(this.getKnownSongs()[i] == null){
                    this.getKnownSongs()[i] = song;
                }
            }
        }
        return false;
    }



}


