public class Main {
    public static void main(String[] args){

        University u1 = new University("Kashan university");
        u1.setgf("govermental");
        u1.setcount_collage(10);
        u1.setrank("2");
        u1.setarea(12000);
        
        u1.getname();
        u1.getgf();
        u1.getcount();
        u1.getrank();
        u1.getarea();
        u1.showinfo();
        System.out.print("\n");


        Collage c1 = new Collage("Basic Science", 3);
        c1.setname_major("Computer Science");
        c1.setstu_num(17);

        c1.gettitle();
        c1.getcount_major();
        c1.getname_major();
        c1.getcountstu();
        c1.show_info();
        System.out.print("\n");

        ClassCollection class1 = new ClassCollection(20, 100);
        class1.setvidoepro("YES");
        class1.getc_class();
        class1.getc_ch();
        class1.getvideopj();
        class1.show_info();
        System.out.print("\n");

        Lib lib1 = new Lib(30000 , 8500 , 3 , "1359");

        lib1.getcb();
        lib1.getuser();
        lib1.getfloor();
        lib1.getyear();
        lib1.show_info();
        System.out.print("\n");

        Self s1 = new Self(4, 2, "Jojeh");
        s1.set_personnel(30);
        s1.set_reserved(5000);
        s1.set_canceled(300);

        s1.get_countself();
        s1.get_countfood();
        s1.getfood();
        s1.getpersonnel();
        s1.getreserved();
        s1.getcanceled();
        s1.show_info();
        System.out.print("\n");

        Boofe b1 = new Boofe("Roma", "8 To 21");
        b1.set_species(350);
        b1.set_worker(2);

        b1.getname();
        b1.gettime();
        b1.getspecies();
        b1.getworker();
        b1.show_info();
        System.out.print("\n");

        Sites site = new Sites(60, 14, 46);
        site.set_windows("10");
        site.set_stu(true);

        site.getnumc();
        site.getbc();
        site.gethc();
        site.getwindows();
        site.get_stu();
        site.show_info();
        System.out.print("\n");
        
        Professors_office room = new Professors_office(2, 6);
        room.Set_stutime("16 To 18");
        
        room.getperson();
        room.getchair();
        room.getsuttime();
        room.show_info();
        System.out.print("\n");

        Dormitories dorm = new Dormitories("Asar", 17, 5);
        dorm.setbacktime("21");
        dorm.set_price(2000000);

        dorm.getname();
        dorm.getcountroom();
        dorm.getperson();
        dorm.gettime();
        dorm.getprice();
        dorm.show_info();
        System.out.print("\n");

        PE club = new PE(3000, "Tennis", 10);
        club.set_user(6000);

        club.getareap();
        club.getmaj();
        club.getmajcount();
        club.get_user();
        club.show_info();
        System.out.print("\n");

        Lab lab1 = new Lab(2700, 20, "Biotechnology Lab");
        lab1.setlab(1000);

        lab1.get_glass();
        lab1.getmicro();
        lab1.gettitle();
        lab1.getsample();
        lab1.show_info();
        System.out.print("\n");

        Human human1 = new Human("Amir", 47 , "Brown");
        human1.setHeight(1.8);
        human1.setWeight(77);
        
        human1.getName();
        human1.getAge();
        human1.getHaircolor();
        human1.getHeight();
        human1.getWeight();
        human1.show_info();
        System.out.print("\n");

        Ostad ostad1 = new Ostad("Mosen Mohseni" , "phD" , "AI");
        ostad1.setAge(50);
        ostad1.setYear(20);

        ostad1.geFullname();
        ostad1.getDegree();
        ostad1.getFeild();
        ostad1.getAge();
        ostad1.getYear();
        ostad1.show_info();
        System.out.print("\n");

        MasooulAmozesh m = new MasooulAmozesh("coordination of all the activities", "8 To 17");
        m.setDuties("Who is directly responsible for the coordination of all the activities carried out in the education unit in terms of quantity and quality. ");
        
        m.getRespons();
        m.getWorktime();
        m.getDuties();
        m.show_info();
        System.out.print("\n");

        Student st1 = new Student("Sana Eslami", 19, "Bachelor's degree", 2);
        st1.setYear("1402");
        st1.setFeild("Computer Science");

        st1.getName();
        st1.getAge();
        st1.getGrade();
        st1.getTerm();
        st1.getYear();
        st1.getFeild();
        st1.show_info();
        System.out.print("\n");


        Worker worker1 = new Worker("Cleaning", "1391", 15-000-000D);
        worker1.setDuty("Do diffrent work in university environment...");

        worker1.getRespons();
        worker1.getYear();
        worker1.getSalary();
        worker1.getDuty();
        worker1.show_info();
        System.out.print("\n");

    }
}
