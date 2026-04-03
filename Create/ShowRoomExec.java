class ShowRoomExec
{
    public static void main(String[] args)
    {
        ShowRoom s = new ShowRoom();

        s.addManager("Sandeep");
        s.addManager("Akash");
        s.addManager("Pragnya");
        s.addManager("priya");
        s.addManager("Mamatha");
        s.addManager("Pavan");
        s.addManager("Sampath");
        s.addManager("Samarth");

        s.getDetails();
    }
}