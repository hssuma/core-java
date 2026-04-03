class YouTube
{
    String videoTitleNames[] = new String[15];
    int index;

    boolean addVideo(String video)
    {
        boolean isAdded = false;

        if(index < videoTitleNames.length)
        {
            if(video != null)
            {
                videoTitleNames[index++] = video;
                isAdded = true;
            }
            else
                System.out.println(video + " is not valid");
        }
        else
            System.out.println("Memory is full");

        return isAdded;
    }

    void getDetails()
    {
        for(String v : videoTitleNames)
            System.out.println(v);
    }
}