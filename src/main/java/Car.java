import java.util.ArrayList;

public class Car {
    private Wheel wheel ;
    public Car(WheelTypes wheelType) {
        switch (wheelType){
            case Wheel10 -> wheel = new Wheel10();
            case Wheel20 -> wheel = new Wheel20();
            case Wheel40 -> wheel = new Wheel40();
            case Wheel60 -> wheel = new Wheel60();
            case Wheel80 -> wheel = new Wheel80();
        }
    }

    public Wheel getWheel() {
        return this.wheel;
    }

    public void setWheels(Wheel wheel) {
        this.wheel = wheel;
    }

}
enum WheelTypes{
    Wheel10,Wheel20,Wheel40,Wheel60,Wheel80
}