public class ClassCollection {

    private int count_class;
    private int count_chair;
    private String video_projctor;
    
    
    public ClassCollection(int class_count , int chair_count)
    {
        count_class = class_count;
        count_chair = chair_count;
    }
    public void setvidoepro(String r)
    {
        video_projctor = r;
    }

    public int getc_class()
    {
        return count_class;
    }
    public int getc_ch()
    {
        return count_chair;
    }
    public String getvideopj()
    {
        return video_projctor;
    }
    public void show_info()
    {
        System.out.print("Count of classes are: " + count_class + "\n");
        System.out.print("Count of Chairs is: " + count_chair + "\n");
        System.out.print("Dose Class has VideoProjector? " + video_projctor + "\n");
    }

}
