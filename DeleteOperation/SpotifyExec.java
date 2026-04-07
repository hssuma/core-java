class SpotifyExec
{
    public static void main(String[] args)
    {
        Spotify s = new Spotify();

        s.addSong("3-3Peg");
        s.addSong("Blinding Lights");
        s.addSong("Tum Hi Ho");
        s.addSong("Believer");
        s.addSong("Kesariya");
        s.addSong("Levitating");
        s.addSong("Perfect");
        s.addSong("Senorita");
        s.addSong("Stay");
        s.addSong("Calm Down");
        s.getSongs();
		s.updateSong("3-3Peg", "3-3 PEG");
		s.getSongs();
		s.deleteSong("3-3 PEG");
		s.getSongs();
		
    }
}