public class FireTruck<T extends FireFighter> extends Car<T> {
   public FireTruck(int MaxHumans) {
        super(MaxHumans);
    }
    @Override
    public boolean PutInTransport(T human) {
        return super.PutInTransport(human);
    }

    @Override
    public void GetFromTransport(T human) {
         super.GetFromTransport(human);
    }

}
