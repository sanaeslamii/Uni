public class Lab {

    private int glass_count;
    private int microscope_count;
    private String title;
    private int Laboratory_sample;

    public Lab(int g , int m , String t)
    {
        glass_count = g;
        microscope_count = m;
        title = t;
    }
    public void setlab(int l)
    {
        Laboratory_sample = l;
    }

    public int get_glass()
    {
        return glass_count;
    }
    public int getmicro()
    {
        return microscope_count;
    }
    public String gettitle()
    {
        return title;
    }
    public int getsample()
    {
        return Laboratory_sample;
    }
    public void show_info()
    {
        System.out.println("Count of glass is: " + glass_count);
        System.out.println("Count of microscope is: " + microscope_count);
        System.out.println("Lab Title is: " + title);
        System.out.println("Count of Lab Sample: " + Laboratory_sample);

    }
}
