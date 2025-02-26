package Generics;

public class Box<T>{ // T is a type parameter

    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}
