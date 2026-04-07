class CourseExec
{
    public static void main(String[] args)
    {
        Course c = new Course();

        c.addTechnology("Java");
        c.addTechnology("Python");
        c.addTechnology("C");
        c.addTechnology("C++");
        c.addTechnology("JavaScript");
        c.addTechnology("HTML");
        c.addTechnology("CSS");
        c.addTechnology("SQL");
        c.addTechnology("MongoDB");
        c.addTechnology("Spring");
        c.addTechnology("Hibernate");
        c.addTechnology("React");
        c.addTechnology("NodeJS");
        c.addTechnology("AWS");
        c.addTechnology("Docker");
		c.updateCourses("Java", "Advance java");
        c.getCourses();
		c.deletetechnology("AWS");
		c.getCourses();
    }
}