import java.util.ArrayList;
import java.util.List;

public class Road {
    String name;

    public Road(String Name){
        name = Name;
    }

 public int getCountOfHumans(ArrayList<? extends Human> transport)
 {
     int sum = 0;
     for (Human human : transport) {
         sum++;
     }
     return sum  ;
 }
}
