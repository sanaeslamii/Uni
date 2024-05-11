public class Sites{

    private int number_computers;
    private int broken_computers;
    private int healthy_computers;
    private String Windows;
    private boolean open_or_close;

    public Sites(int nc , int bc , int hc)
    {
        number_computers = nc;
        broken_computers = bc;
        healthy_computers = hc;
    }
    public void set_windows(String w)
    {
        Windows = w;
    }
    public void set_stu(boolean oc)
    {
        open_or_close = oc;
    }

    public int getnumc()
    {
        return number_computers;
    }
    public int getbc()
    {
        return broken_computers;
    }
    public int gethc()
    {
        return healthy_computers;
    }
    public String getwindows()
    {
        return Windows;
    }
    public boolean get_stu()
    {
        return open_or_close;
    }

    public void show_info()
    {
        System.out.print("Count of all Computers is: " + number_computers + "\n");
        System.out.print("Count of Broken Computers is: " + broken_computers + "\n");
        System.out.print("Count of Healthy Computers is: " + healthy_computers + "\n");
        System.out.print("Windows is: " + Windows + "\n");
        System.out.print("Is it open now? " + open_or_close + "\n");

    }
}
