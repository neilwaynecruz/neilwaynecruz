package GETTERS.SETTERS;

public class Car {


   private final String model;
   private String color;
   private int price;

    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    String getPrice() {
        return "P" + this.price;
    }


    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        if(price < 0){
            System.out.println("Invalid price, Can't be negative");
        }
        else{
            this.price = price;
        }
    }




}
