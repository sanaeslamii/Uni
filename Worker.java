public class Worker {

    private String responsibility;
    private String year_of_employment;
    private double salary;
    private String duty;

    public Worker(String r , String y , double s)
    {
        responsibility = r;
        year_of_employment = y;
        salary = s;
    }
    public void setDuty(String d)
    {
        duty = d;
    }
    public String getRespons()
    {
        return responsibility;
    }
    public String getYear()
    {
        return year_of_employment;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getDuty()
    {
        return duty;
    }

    public void show_info()
    {
        System.out.println("Responsibility is: " + responsibility);
        System.out.println("Year of Employment is: " + year_of_employment);
        System.out.println("Each Month Salary is: " + salary);
        System.out.println("Duty is: " + duty);

    }
}
