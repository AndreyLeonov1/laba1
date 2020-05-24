import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Register {
    private ArrayList<TramCard> register = new ArrayList<TramCard>();

    public void AddInRegister(TramCard card)
    {
        register.add(card);
    }

    public ArrayList<TramCard> GetRegister(){
        return register;
    }
    public boolean IsRegisterContain(TramCard card)
    {
    boolean result = false;
    for (TramCard c: register) {
        if(c.equals(card)) result = true;
    }
    return result;
}
    public void BlockCard(int id)
    {
        for (TramCard c: register) {
            if(c.GetId()==id)
            {
                c.SetIsNotBlocked(false);
            }
        }

    }
    public void CardInformationById(int id) {
        String info = "";
        for (TramCard c : register) {
            if (c.GetId() == id) {
                String pilga = c.GetIsPilga() ? " Льготная, " : ""; String active = c.GetIsNotBlocked() ? "\n" : "Заблокированя, \n ";
                info += "\n О карте: \n Номер карты" + c.GetId() + ", \n Прохождений: " + c.CountAllowMoves() +
                        ",\n Отказов: " + c.CountBlockMoves() + ",\n"+ pilga + active + c.CardInfo();
            }
            System.out.println(info);
        }
    }
}
