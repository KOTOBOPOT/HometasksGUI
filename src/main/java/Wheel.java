public abstract class Wheel {
    private int radius;
    WheelTypes wheelType;
    public Wheel(WheelTypes wheelType){
        this.wheelType = wheelType;
        switch (wheelType){
            case Wheel10 -> radius = 10;
            case Wheel20 -> radius = 20;
            case Wheel40 -> radius = 40;
            case Wheel60 -> radius = 60;
            case Wheel80 -> radius = 80;
        }
    }

    public Wheel(int radius) {
        this.radius = radius;
        switch (radius){
            case 10-> this.wheelType = WheelTypes.Wheel10;
            case 20-> this.wheelType = WheelTypes.Wheel20;
            case 40-> this.wheelType = WheelTypes.Wheel40;
            case 60-> this.wheelType = WheelTypes.Wheel60;
            case 80-> this.wheelType = WheelTypes.Wheel80;
            default -> throw new RuntimeException("Unknown wheel radius type");
        }
    }

    public int getRadius(){
        return this.radius;
    }

    public WheelTypes getWheelType() {
        return wheelType;
    }
}
class Wheel20 extends Wheel{
    public Wheel20() {
        super(WheelTypes.Wheel20);
    }
}
class Wheel40 extends Wheel{
    public Wheel40() {
        super(WheelTypes.Wheel40);
    }
}
class Wheel60 extends Wheel{
    public Wheel60() {
        super(WheelTypes.Wheel60);
    }
}
class Wheel80 extends Wheel{
    public Wheel80() {
        super(WheelTypes.Wheel80);
    }
}
class Wheel10 extends Wheel{
    public Wheel10() {
        super(WheelTypes.Wheel10);
    }
}