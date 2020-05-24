import java.util.ArrayList;

public abstract class Transport<T extends Human> {
    int maxHumans;
    protected ArrayList<T> humansIn = new ArrayList<>();
    public Transport(int maxHumans)
    {
        this.maxHumans = maxHumans;
    }
     boolean PutInTransport(T human) { //обработка исключения на отсутствие места для человека в транспорте

             if (humansIn.size() >= maxHumans) {
                 throw new CustomException("Ошибка - места недостаточно");
             }
             humansIn.add(human);
             System.out.println("Пасажир сел в транспорт.");
             return true;


     }
    public int getFreePlaces() {
        return maxHumans - humansIn.size();
    }
    public int getNumbeeHumansIn(){
        return humansIn.size();
    }
     public void GetFromTransport(T human){ //обработка исключения на отсутствие человека в транспорте

            if(humansIn.contains(human)){
                humansIn.remove(human);
                System.out.println("Пасажир вишел из транспорта");
            }
            else {
                throw new CustomException("Ошибка - пасажира нету в транспорте");

            }

    }


    public int getMaxHumans() {
        return maxHumans;
    }
    public void setMaxHumans(int maxHumans) {
        this.maxHumans = maxHumans;
    }
}
