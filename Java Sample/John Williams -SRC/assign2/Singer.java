package assign2;

public class Singer extends BandMember {
    public Singer(String name, int numOfSongs) {
        super(name, numOfSongs);
    }
    public Singer (String name){
        super(name);
    }
    @Override
    public String toString() {
        String result="";
        result = "I am a Singer: "+ super.toString();
        return  result;
    }
    @Override
    public boolean playSong(Song song){
        if(super.playSong(song)){
            System.out.println(this.getName() +microphone + "sings "+ microphone+ "the "+song.getGenre()+"song "+song.getName());
            return true;
        }
        System.out.println(this.getName() + " does not know " + song.toString());
        return false;
    }








}

