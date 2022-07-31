package prototypeExample;

public class Car implements Cloneable {

    public enum CarType {
        MERCEDES,
        BMW,
        FERRARI,
        TOYOTA
    }

    private CarType carType;
    private Person owner;


    public Car() {

    }


    public void setOwner(String name) {
        Person owner = new Person(name);
        this.owner = owner;
    }

    public Person getOwner() {
        return owner;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }


    @Override
    public Car clone() {
        try {
            Car car = (Car) super.clone();
//            car.owner = owner.clone();
            return car;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}

