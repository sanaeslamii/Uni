public class Ostad {

    private String FullName;
    private String degree_of_education;
    private String Field_of_Study;
    private int age;
    private int year_of_teaching_experience;

    public Ostad(String name , String degree , String Field)
    {
        FullName = name;
        degree_of_education = degree;
        Field_of_Study = Field;
    }

    public void setAge(int a)
    {
        age = a;
    }
    public void setYear(int y)
    {
        year_of_teaching_experience = y;
    }

    public String geFullname()
    {
        return FullName;
    }
    public String getDegree()
    {
        return degree_of_education;
    }
    public String getFeild()
    {
        return Field_of_Study;
    }
    public int getAge()
    {
        return age;
    }
    public int getYear()
    {
        return year_of_teaching_experience;
    }
    public void show_info()
    {
        System.out.println("Ostad Full name: " + FullName);
        System.out.println("degree of education is:  " + degree_of_education);
        System.out.println("Field of Study is: " + Field_of_Study);
        System.out.println("Age is: " + age);
        System.out.println("year of teaching experience is: " + year_of_teaching_experience);

    }
}
