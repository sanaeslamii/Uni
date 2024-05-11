public class University {

    private String uniname;
    private String govermental_or_free;
    private int count_of_collage;
    private String rank;
    private double area;

    // public void setname(String n)
    // {
    //     uniname = n;
    // }
    public University(String n)
    {
        uniname = n;
    }
    public void setgf(String g)
    {
        govermental_or_free = g;
    }
    public void setcount_collage(int c)
    {
        count_of_collage = c;
    }
    public void setrank(String r)
    {
        rank = r;
    }
    public void setarea(double a)
    {
        area = a;
    }

    public String getname()
    {
        return uniname;
    }
    public String getgf()
    {
        //govermantal or free
        return govermental_or_free;
    }
    public int getcount()
    {
        return count_of_collage;
    }
    public String getrank()
    {
        return rank;
    }
    public double getarea()
    {
        return area;
    }
    public void showinfo()
    {
        System.out.println("uni name is: " + uniname);
        System.out.println("govermental or free: " + govermental_or_free);
        System.out.println("count of colleg is: " + count_of_collage);
        System.out.println("Rank of uni is: " + rank);
        System.out.println("Area is: " + area);
    }

}
