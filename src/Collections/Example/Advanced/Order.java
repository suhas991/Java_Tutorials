package Collections.Example.Advanced;

public class Order {
    private String name;
    private String item;
    private int priOrder;


    public Order(String name, String item, int priOrder) {
        this.name = name;
        this.item = item;
        this.priOrder = priOrder;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriOrder() {
        return priOrder;
    }
    public void setPriOrder(int priOrder) {
        this.priOrder = priOrder;
    }



}
