public class PoliceCar<T extends PoliceMan> extends Car<T> {
   public PoliceCar(int MaxHumans) {
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
