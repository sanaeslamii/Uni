public class Collage {

    private String title;
    private int count_major;
    private String name_major;
    private int count_stu;

    // public void settitle(String t)
    // {
    //     title = t;
    // }
    public Collage(String t, int m)
    {
        title = t;
        count_major = m;
    }
    public void setname_major(String name)
    {
        name_major = name;
    }
    public void setstu_num(int cs)
    {
        count_stu = cs;
    }
    

    public String gettitle()
    {
        return title;
    }
    public int getcount_major()
    {
        return count_major;
    }
    public String getname_major()
    {
        return name_major;
    }
    public int getcountstu()
    {
        return count_stu;
    }

    public void show_info()
    {
        System.out.print("Title(name) of collage is: " + title +"\n");
        System.out.print("Count of major is: " + count_major + "\n");
        System.out.print("name of major is: " + name_major + "\n");
        System.out.print("Count of Student is: " + count_stu + "\n");

    }
    
}