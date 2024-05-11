public class Professors_office {

    private int count_person;
    private int chairs;
    private String Student_time_visit;

    public Professors_office(int person , int chair)
    {
        count_person = person;
        chairs = chair;
    }
    public void Set_stutime(String st)
    {
        Student_time_visit = st;
    }

    public int getperson()
    {
        return count_person;
    }
    public int getchair()
    {
        return chairs;
    }
    public String getsuttime()
    {
        return Student_time_visit;
    }
    public void show_info()
    {
        System.out.format("There are %d proferrors in the room\n" , count_person);
        System.out.println("number of chairs:" + chairs );
        System.out.println("Student can visit at Time: " + Student_time_visit);
    }
}
