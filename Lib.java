public class Lib {

    private double count_book;
    private double user;
    private int floor;
    private String year_built;

    public Lib(double cb , double u , int f , String y)
    {
        count_book = cb;
        user = u;
        floor = f;
        year_built = y;
    }
    public double getcb()
    {
        return count_book;
    }
    public double getuser()
    {
        return user;
    }
    public int getfloor()
    {
        return floor;
    }
    public String getyear()
    {
        return year_built;
    }

    public void show_info()
    {
        System.out.print("Count of Books that are in this Library is: " + count_book + "\n");
        System.out.print("Count of User is: " + user + "\n");
        System.out.format("Library has %d floors\n" , floor);
        System.out.format("Year of Built this Building is : " + year_built + "\n");
    }
    

}
