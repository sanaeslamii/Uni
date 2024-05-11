public class MasooulAmozesh {

    private String Responsibility;
    private String Duties;
    private String Work_time;

    public MasooulAmozesh(String r , String time)
    {
        Responsibility = r;
        Work_time = time;
    }

    public void setDuties(String d)
    {
        Duties = d;
    }

    public String getRespons()
    {
        return Responsibility;
    }
    public String getDuties()
    {
        return Duties;
    }
    public String getWorktime()
    {
        return Work_time;
    }
    public void show_info()
    {
        System.out.println("Responsibility is: " + Responsibility);
        System.out.println("Duties is: " + Duties);
        System.out.println("WorkTime is From: " + Work_time );
    }
}
