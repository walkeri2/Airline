public class Plane {

    private PlaneType plane;

    public Plane(PlaneType plane){
        this.plane = plane;
    }

    public int getCapacity(){
        return this.plane.getCapacityFromEnum();
    }

    public int getWeight(){
        return this.plane.getWeightFromEnum();
    }
}
