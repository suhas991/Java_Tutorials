package Generics.Example_1;

public class Box<T>{
    private T content;

    public void setContent(T item){
        this.content = item;
    }

    public T getContent(){
        return content;
    }

}
