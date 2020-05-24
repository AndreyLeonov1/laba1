public class Bus <T extends Human> extends Transport<T> {
   public Bus (int MaxHumans) {
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
