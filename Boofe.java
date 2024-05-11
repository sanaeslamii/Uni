public class Boofe {

    private String name;
    private String work_time;
    private int count_species;
    private int worker;

    public Boofe(String n , String time)
    {
        name = n;
        work_time = time;
    }
    public void set_species(int cs)
    {
        count_species = cs;
    }
    public void set_worker(int w)
    {
        worker = w;
    }

    public String getname()
    {
        return name;
    }
    public String gettime()
    {
        return work_time;
    }
    public int getspecies()
    {
        return count_species;
    }
    public int getworker()
    {
        return worker;
    }

    public void show_info()
    {
        System.out.print("Name of Boofe is: " + name + "\n");
        System.out.print("Work Time is From: " + work_time + "\n");
        System.out.print("Count Species are near: " + count_species + "\n");
        System.out.print("Number of poeple who work there is: " + worker + "\n");
    }


}
