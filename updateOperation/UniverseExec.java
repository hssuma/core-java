class UniverseExec
{
    public static void main(String[] args)
    {
        Universe u = new Universe();

        u.addGalaxy("Milky Way");
        u.addGalaxy("Andromeda");
        u.addGalaxy("Sombrero");
        u.addGalaxy("Whirlpool");
        u.addGalaxy("Pinwheel");
        u.addGalaxy("Cartwheel");
        u.addGalaxy("Triangulum");
        u.addGalaxy("Messier 87");
        u.addGalaxy("Centaurus A");
        u.addGalaxy("Black Eye");
        u.addGalaxy("IC 1101");
		
		u.updateGalaxy("IC 1101", "IC11011");
        u.getGalaxies();
    }
}