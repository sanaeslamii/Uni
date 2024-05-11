public class PE {
    
    private double area_PE;
    private String major_PE;
    private int major_count;
    private int user_club;

    public PE(double area , String name_major , int maj_cout)
    {
        area_PE = area;
        major_PE = name_major;
        major_count = maj_cout;
    }
    public void set_user(int uc)
    {
        user_club = uc;
    }

    public double getareap()
    {
        return area_PE;
    }
    public String getmaj()
    {
        return major_PE;
    }
    public int getmajcount()
    {
        return major_count;
    }
    public int get_user()
    {
        return user_club;
    }

    public void show_info()
    {   
        System.out.println("Area of PE is: " + area_PE);
        System.out.println("name of major is: " +major_PE);
        System.out.println("count of major in this PE club: " +major_count);
        System.out.println("number of Person use club: " + user_club);
    }

}
