public class Taxi<T extends Human> extends Car<T> {
   public Taxi(int MaxHumans) {
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
