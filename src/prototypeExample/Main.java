package prototypeExample;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setOwner("Dmytro");
        car.setCarMark(Car.CarMark.BMW);
        Car carCopy = car.clone();
        System.out.println("Name of first owner " + car.getOwner().getName());
        System.out.println("Type of car " + car.getCarMark());
        System.out.println("Name of first owner " + carCopy.getOwner().getName());
        System.out.println("Type of car " + carCopy.getCarMark());
//        carCopy.getOwner().setName("Andriy");
//        carCopy.setCarType(Car.CarType.FERRARI);
//        System.out.println(car.getOwner().getName());
//        System.out.println("Type of car " + car.getCarType());
//        System.out.println(carCopy.getOwner().getName());
//        System.out.println("Type of car " + carCopy.getCarType());
    }

}
