public enum PlaneType {
    BOING747(10, 100);


    private final int capacity, weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacityFromEnum(){
        return capacity;
    }

    public int getWeightFromEnum(){
        return weight;
    }
}
