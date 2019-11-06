package assign2;

public class Drummer extends BandMember{
    public Drummer(String name, int numOfSongs){
        super(name,numOfSongs);
    }
    public Drummer(String name){
        super(name);
    }
    @Override
    public String toString() {
        String result="";
        result = "I am a Drummer: " + super.toString() ;
        return  result;
    }
    @Override
    public boolean playSong(Song song){
        if(super.playSong(song)){
            System.out.println(this.getName() +drums + "plays"+ drums+ "the"+song.getGenre()+"song"+song.getName());
            return true;
        }
        System.out.println(this.getName() + " does not know " + song.toString());
        return false;
    }
}
