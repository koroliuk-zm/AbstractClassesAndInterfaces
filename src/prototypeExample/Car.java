package prototypeExample;

public class Car implements Cloneable {

    public enum CarMark {
        MERCEDES,
        BMW,
        FERRARI,
        TOYOTA
    }

    private CarMark carMark;
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

    public void setCarMark (CarMark carMark) {
        this.carMark = carMark;
    }

    public CarMark getCarMark() {
        return carMark;
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

