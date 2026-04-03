class SpotifyExec
{
    public static void main(String[] args)
    {
        Spotify s = new Spotify();

        s.addSong("Shape of You");
        s.addSong("Blinding Lights");
        s.addSong("Tum Hi Ho");
        s.addSong("Believer");
        s.addSong("Kesariya");
        s.addSong("Levitating");
        s.addSong("Perfect");
        s.addSong("Senorita");
        s.addSong("Stay");
        s.addSong("Calm Down");

        s.getDetails();
    }
}