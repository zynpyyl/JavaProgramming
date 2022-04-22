package day43_AbstractClass.car;

public class CarShop {

    public static void main(String[] args) {



    //Car car1=new Car("Jazz","White",2022,25000);
    //we can not create object from abstract class

    Honda honda=new Honda("Jazz","White",2022,25000);
    Audi audi=new Audi("Q7","Black",2021,50000);
    Tesla tesla=new Tesla("Model3","White",2022,100000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
