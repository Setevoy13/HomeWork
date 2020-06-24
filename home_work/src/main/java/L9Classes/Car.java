package L9Classes;

public class Car {
    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;
    //Класс включающий данные машины. здесь создаем класс и наполняем деталями (Брэнд, модэль, год, цвет, цена.

    public void drive(){
        System.out.println(brand + " " +model + " is driving");
    }
    public void printcarinfo(){
        System.out.println("Brand -> "+ brand+"\nModel -> "+ model+ "\nYear -> "+year +"\nColor -> "+ color+ "\nPrice -> "+price);
    }
}
