package assign2;

import java.sql.SQLOutput;

public class Band extends BandMember{
    private BandMember[] members;
    private int numberOfMembers;
    public Band(String name, int numOfSongs){
        super(name,numOfSongs);
        members = new BandMember[4];
    }
    public Band(String name){
        super(name);
        members = new BandMember[4];
    }

    public boolean addMember( BandMember m){
        if (members[3]!=null){
            return true;

        }
        return false;
    }
    public boolean removeMember(BandMember m){
        for (int i=0;i<numberOfMembers;i++){
            if(members[i].equals(m)){
                members[i]=null;
                for(int j = i; j < numberOfMembers-1; j++){
                    members[j]= members[j+1];
                }
                members[numberOfMembers-1]= null; //make the last spot null after shifting elements
                numberOfMembers=numberOfMembers-1; //decrease the number of elements
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean learnSong(Song song){
        if(super.canLearnNewSong(song)){
            super.learnSong(song);
            return true;
        }
        return  false;


    }
    public boolean playSong(Song song){
        if (super.knowsSong(song)){
            System.out.println("We are "+ this.getName()+" playing the song "+ song.getName());
            for(int i =0 ; i < numberOfMembers; i++){
                members[i].playSong(song);
            }
        }
        System.out.println(this.getName()+"doesn’t know the song "+ song.getName()+ "  Hit it!”");

        return false;
    }
}
