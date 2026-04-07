class MovieExec
{
    public static void main(String[] args)
    {
        Movie m = new Movie();

        m.addCast("Puneethraj kumar");
        m.addCast("Shivraj kumar");
        m.addCast("Sadu kokila");
        m.addCast("Sharan");
        m.addCast("Chikkanna");
        m.addCast("Prajwal");
        m.addCast("Suddep");
        m.addCast("Darshan");
        m.addCast("Yash");
        m.getCast();
		m.upadteCast("Yash", "Rocking star Yash");
		m.getCast();
		m.deleteCast("Darshan");
		m.getCast();
    }
}