public class Human {
    
    private String name;
    private int age;
    private String hair_color;
    private double height;
    //Height(m)
    private double weight;
    //Weight(kg)

    public Human(String n , int a , String hair_c)
    {
        name = n;
        age = a;
        hair_color = hair_c;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public void setWeight(double w)
    {
        weight = w;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
            return age;
    }
    public String getHaircolor()
    {
        return hair_color;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }

    public void show_info()
    {
        System.out.println("Person Name is: " + name);
        System.out.println("Person Age is: " + age);
        System.out.println("Person Haircolor is: " + hair_color);
        System.out.println("Person Height is: " + height);
        System.out.println("Person Weight is: " + weight);

    }


}
