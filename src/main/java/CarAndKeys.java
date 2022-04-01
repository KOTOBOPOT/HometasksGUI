import java.util.ArrayList;

public class CarAndKeys {
    public int distance = 0;
    public Car car;
    public Keys keys;
    private int limit;
    public CarAndKeys(Car car, Keys keys, int limit){
        this.car = car;
        this.keys = keys;
        this.distance = calculateDistance();
        this.limit = limit;
    }
    public int calculateDistance(){
        distance = 1 +1 ; //TODO: calc distance
        if(!distance_check()){
            System.out.println("DANGEROUS DISTANCE!!");//TODO: Send coordinates
        }
        return distance;
    }
    public boolean distance_check(){
        if (this.distance > limit){return false;}
        else  return true;
    }
}
class Car{
    private ArrayList<Integer>coordinates;// = null;
    public Car(ArrayList<Integer>coordinates){
        this.coordinates = coordinates;
    }

    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }
    public void updateCoordinates(ArrayList<Integer> new_coordinates){
        this.coordinates = new_coordinates;
    }
}
class Keys{
    private ArrayList<Integer>coordinates;// = null;
    public Keys(ArrayList<Integer>coordinates){
        this.coordinates = coordinates;
    }
    public void updateCoordinates(ArrayList<Integer> new_coordinates){
        this.coordinates = new_coordinates;
    }
    public ArrayList<Integer> getCoordinates() {
        return coordinates;
    }
}