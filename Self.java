public class Self {

    private int count_self;
    private int count_food;
    private String food_name;
    private int personnel;
    private double count_reserved;
    private int count_canceled;

    public Self(int num_self , int num_foods , String name_f)
    {
        count_self = num_self;
        count_food = num_foods;
        food_name = name_f;
    }
    public void set_personnel(int np)
    {
        personnel = np;
    }
    public void set_reserved(double r)
    {
        count_reserved = r;
    }
    public void set_canceled(int cancel)
    {
        count_canceled = cancel;
    }

    public int get_countself()
    {
        return count_self;
    }
    public int get_countfood()
    {
        return count_food;
    }
    public String getfood()
    {
        return food_name;
    }
    public int getpersonnel()
    {
        return personnel;
    }
    public double getreserved()
    {
        return count_reserved;
    }
    public int getcanceled()
    {
        return count_canceled;
    }

    public void show_info()
    {
        System.out.print("number of self is: " + count_self + "\n");
        System.out.print("number of food is: " + count_food + "\n");
        System.out.print("Today Type of food is :" + food_name + "\n");
        System.out.print("count of personnel work there : " + personnel +"\n");
        System.out.print("count of Today reserved is : " + count_reserved +"\n");
        System.out.print("count of Today canceled is : " + count_canceled +"\n");

    }

}
