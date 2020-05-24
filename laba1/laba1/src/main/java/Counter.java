import java.util.ArrayList;

public class Counter {
    public ArrayList<String> LengthLessMiddleToArr (ArrayList<String> inArr)
    {
        ArrayList<String> outArr = new ArrayList<>();
        int middle = CountMiddle(inArr);
        //int count = 0;
        for(int i = 0; i < inArr.size(); i++){
            if(inArr.get(i).length()<= middle) {
                outArr.add(inArr.get(i));
            }
        }
        return outArr;
    }
    public ArrayList<String> LengthMoreMiddleToArr (ArrayList<String> inArr)
    {
        ArrayList<String> outArr = new ArrayList<>();
        int middle = CountMiddle(inArr);
         for(int i = 0; i < inArr.size(); i++){
            if(inArr.get(i).length() >= middle) {
                outArr.add(inArr.get(i));
            }
        }
        return outArr;
    }

    public int CountMiddle (ArrayList<String> inArr){
        int sum = 0;
        for (int i = 0; i < inArr.size(); i++) {
            sum += inArr.get(i).length();
        }
        return sum/inArr.size();
    }

}
