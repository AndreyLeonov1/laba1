public class Car<T extends Human> extends Transport<T> {

    public Car(int MaxHumans) {
        super(MaxHumans);
    }
    @Override
    public boolean PutInTransport(T human)  {
        return super.PutInTransport(human);
    }

    @Override
    public void GetFromTransport(T human) {
         super.GetFromTransport(human);
    }

}
