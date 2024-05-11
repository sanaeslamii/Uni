public class Dormitories {

    private String name;
    private int count_of_room;
    private int person_in_room;
    private String back_time;
    private double price;

    public Dormitories(String n , int room , int person)
    {
        name = n;
        count_of_room = room;
        person_in_room = person;
    }
    public void setbacktime(String bt)
    {
        back_time = bt;
    }
    public void set_price(double p)
    {
        price = p;
    }

    public String getname()
    {
        return name;
    }
    public int getcountroom()
    {
        return count_of_room;
    }
    public int getperson()
    {
        return person_in_room;
    }
    public String gettime()
    {
        return back_time;
    }
    public double getprice()
    {
        return price;
    }

    public void show_info()
    {
        System.out.println("Dorm Name: " + name);
        System.out.println("Count of room: " + count_of_room);
        System.out.println("Count of Person in Room: " + person_in_room);
        System.out.println("Back Time is: " + back_time);
        System.out.println("Price is: " + price);

    }

}
