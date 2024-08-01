package Collections.Example.Simple;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private String location;

    public Student(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ']';
    }

    @Override
    public int compareTo(Student that) {
        int val = this.getAge() - that.getAge();
        if(val != 0){
            return val;
        }else{
            return this.getLocation().compareTo(that.getLocation());
        }
    }
}
