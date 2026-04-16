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

    void getVideo()
    {
        for(String v : videoTitleNames)
            System.out.println(v);
    }
	
	boolean updatevideo(String existingname, String updatename)
	{
		boolean isUpdated = false;
		for(int i = 0; i<videoTitleNames.length; i++)
		{
			if(videoTitleNames[i] == existingname)
			{
				videoTitleNames[i] = updatename;
				isUpdated = true;
			}
		}
		return isUpdated;
	}
}