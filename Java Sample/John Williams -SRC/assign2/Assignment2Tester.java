package assign2;

public class Assignment2Tester {

    public static void main(String[] args) {

		Song song = new Song();
		Guitarist slash = new Guitarist("Slash");
		System.out.println(slash.toString());
		System.out.println(slash.getName());
		System.out.println(slash.getNumKnownSongs());
		System.out.println(slash.getKnownSongs().length);
		slash.playAllKnownSongs();

		slash.learnSong(song);
		slash.learnSong(Song.randomSong());
		slash.learnSong(Song.randomSong());

		slash.playAllKnownSongs();

		Singer axel = new Singer("Axel",1);
		axel.learnSong(Song.randomSong());
		if (axel.learnSong(Song.randomSong())){
			System.out.println("This should not have happened.");
		}

		System.out.println(axel);
		axel.playAllKnownSongs();


		Song song2 = new Song("Weird Song", "punk");
		System.out.println(song2);

		System.out.println(song2.toString());

		System.out.println("This song should be printed twice.");

		axel.playSong(song2);

		Song song3 = new Song("Baby");

		System.out.println(song3);
		System.out.println(song3.getName());
		System.out.println(song3.getGenre());
		System.out.println(song3.equals(song2)+" - Should be false.");
		System.out.println(song.equals(new Song())+" - Should be true.");

		Band band = new Band("GNR");
		axel = new Singer("Axel");
		slash = new Guitarist("Slash");
		Drummer somebody = new Drummer("Iforget");

		axel.learnSong(Song.randomSong());
		slash.learnSong(Song.randomSong());
		somebody.learnSong(Song.randomSong());

		band.addMember(axel);
		band.addMember(slash);
		band.addMember(somebody);

		band.learnSong(Song.randomSong());
		band.learnSong(Song.randomSong());

		band.playAllKnownSongs();




    }

}
