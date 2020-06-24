package L9Classes;

public class leson9Classes {
    public static void main(String[] args) {
        Car car = new Car(); //описание объекта целиком (описание класса).
        car.brand = "Toyota";
        car.model = "Camry";
        car.color = "Silver";
        car.year = 2015;
        car.price = 13000;

        Car yourcar = new Car();
        yourcar.model = "Optima";
        yourcar.brand = "Opel";
        yourcar.year = 2018;
        yourcar.price = 1547;


        System.out.println("My new car is "+ car.brand +" "+ car.year);
        System.out.println("Your new car is "+ yourcar.brand +" "+ yourcar.year);

        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Ivanova";
        anna.eyeColor = "Green";
        anna.height = 102;
        anna.year = 2015;

        var boris = new Person();
        boris.name = "Boris";
        boris.lastName = "Petrov";
        boris.year = 2015;
        boris.height = 110;
        boris.eyeColor = "Brown";

        Fruit ff = new Fruit();
        ff.name = "apple";
        ff.color = "green";

        var sharik = new Dog();
        sharik.name = "Sharik";
        sharik.age = 2;
        sharik.breed = "Dvorterier";

        var lord = new Dog();
        lord.name = "Lord";
        lord.age = 5;
        lord.breed = "Dog";

        if(sharik.age>lord.age){
            System.out.println("Sharik is older");
        }else{
            System.out.println("Loerd is older");
        }
//        lord.bark();
        sharik.bark();
        lord.sleep();
        car.printcarinfo();
        anna.printcarinfo();
    }
}
