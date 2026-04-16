class YouTubeExec
{
    public static void main(String[] args)
    {
        YouTube y = new YouTube();

        y.addVideo("Java Tutorial");
        y.addVideo("Python Basics");
        y.addVideo("HTML Guide");
        y.addVideo("CSS Design");
        y.addVideo("JavaScript Intro");
        y.addVideo("React Course");
        y.addVideo("NodeJS Tutorial");
        y.addVideo("SQL basics");
        y.addVideo("MongoDB Guide");
        y.addVideo("Git Tutorial");
        y.addVideo("Spring Boot");
        y.addVideo("Hibernate ORM");
        y.addVideo("AWS Intro");
        y.addVideo("Docker Basics");
        y.addVideo("System Design");
		
		y.updatevideo("SQL basics", "SQL advance");
		

        y.getVideo();
    }
}