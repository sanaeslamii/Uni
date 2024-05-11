public class Student {

    private String name;
    private int age;
    private String grade;
    private int term;
    private String year_entrance;
    private String Feild;

    public Student(String n , int a , String g , int t)
    {
        name = n;
        age = a;
        grade = g;
        term = t;
    }
    public void setYear(String y)
    {
        year_entrance = y;
    }
    public void setFeild(String f)
    {
        Feild = f;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGrade()
    {
        return grade;
    }
    public int getTerm()
    {
        return term;
    }
    public String getYear()
    {
        return year_entrance;
    }
    public String getFeild()
    {
        return Feild;
    }

    public void show_info()
    {
        System.out.println("Student Name is: " + name);
        System.out.println("Student Age is: " + age);
        System.out.println("Student Grade is: " + grade);
        System.out.println("Student Term is:" + term);
        System.out.println("Student Year Entrance is: " + year_entrance);
        System.out.println("Student Feild is: " + Feild);
    }
}
