import org.junit.Rule;
//import org.junit.jupiter;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CarTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test(expected = CustomException.class)
    public void PutHumanInTransport_ThrowException_ItIsNoPlaceInTransport(){
        Car car = new Car(1);
        Human h1 = new Human("Andrey", 19);
        PoliceMan p1 = new PoliceMan("Captain", 89);
        car.PutInTransport(h1);
        car.PutInTransport(p1);

    }
    @Test
    public void PutHumanInTransport_withoutExceptions() {
        Car car = new Car(3);
        Human h1 = new Human("Andrey", 19);
        Human h2 = new Human("Lisa Simpson", 19);
        car.PutInTransport(h1);
        car.PutInTransport(h2);

    }
  @Test
    public void GetHumanFromTransport_withoutExceptions(){
      Car popo = new PoliceCar(3);
      Human h1 = new PoliceMan("Eric", 19);
      Human h2 = new PoliceMan("Mark", 19);
      popo.PutInTransport(h1);
      popo.PutInTransport(h2);
      popo.GetFromTransport(h1);
      popo.GetFromTransport(h2);


    }
    @Test(expected = CustomException.class)
    public void GetHumanFromTransport_ThrowException_ThisHumanIsNotInTransport(){
        Car truck = new FireTruck(10);
       FireFighter f1 = new FireFighter("George", 40);
        truck.PutInTransport(f1); truck.GetFromTransport(f1);
        truck.GetFromTransport(f1);

    }


}
