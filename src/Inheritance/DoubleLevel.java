package Inheritance;

public class DoubleLevel extends SingleLevel{

    public DoubleLevel(String name, int id) {
        super(name, id);
    }

    @Override
    public void property() {

        System.out.println("Children Property");
    }
}
