package Collections.Example.Simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collage {
    public static void main(String[] args) {

        List<Student> classRoom = new ArrayList<>();

        Student s1 = new Student("Aditya",22,"Banglore");
        Student s2 = new Student("Priya",20,"Mysure");
        Student s3 = new Student("Suhas",24,"Delhi");
        Student s4 = new Student("Vishal",19,"Bombay");
        Student s5 = new Student("Anuj",19,"Mumbai");

        classRoom.add(s1);
        classRoom.add(s2);
        classRoom.add(s3);
        classRoom.add(s4);
        classRoom.add(s5);

//        for(Student s : classRoom){
//            System.out.println(s);
//        }
        System.out.println("________USING lamda__________________________________");
        Collections.sort(classRoom,(Student o1,Student o2)-> {
            return o1.getLocation().compareTo(o2.getLocation());
        });
        System.out.println("Sorted by location ");
        for(Student s : classRoom){
            System.out.println(s);
        }
        System.out.println("___________USING Comparable Interface_________________");

        System.out.println("Sorted by age - location ");
        Collections.sort(classRoom);
        for(Student s : classRoom){
            System.out.println(s);
        }
        System.out.println("_____________USING Comparator with lamda ______________");
        System.out.println("Sorted by name ");
        Comparator<Student> ByName = (Student o1, Student o2)->{
                return o1.getName().compareTo(o2.getName());
        };
        Collections.sort(classRoom,ByName);
        for(Student s : classRoom){
            System.out.println(s);
        }
        System.out.println("_______________________________________________________");
    }
}
