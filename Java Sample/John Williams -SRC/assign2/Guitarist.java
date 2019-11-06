package assign2;

public class Guitarist extends BandMember{
    public Guitarist(String name, int numOfSongs){
        super(name,numOfSongs);
    }
    public Guitarist(String name){
        super (name);
    }
    @Override
    public String toString() {
        String result="";
        result = "I am a Guitarist: "+ super.toString();
        return  result;
    }
    @Override
    public boolean playSong(Song song){
        if(super.playSong(song)){
            System.out.println(this.getName() +guitar + "plays"+ guitar+ "the"+song.getGenre()+"song"+song.getName());
            return true;
        }
        System.out.println(this.getName() + " does not know " + song.toString());
        return false;
    }
}
