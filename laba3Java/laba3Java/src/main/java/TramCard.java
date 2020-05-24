import java.time.LocalDateTime;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
 abstract class TramCard {
     private int id;
     private boolean isNotBlocked;
     private boolean isPilga;
     private ArrayList<LocalDateTime> blockMovesList = new ArrayList<LocalDateTime>();
     private ArrayList<LocalDateTime> allowMovesList = new ArrayList<LocalDateTime>();

     TramCard(int Id, boolean isPilga) {
         id = Id;
         isNotBlocked = true;
         this.isPilga = isPilga;
     }


     abstract boolean GoThroughTurniket();
     abstract String CardInfo();

     public String ShowBlockMoves() {
         DateTimeFormatter dayMonthYearTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String result = "Запреты пройти: \n";
         for (LocalDateTime dateObj: blockMovesList) {
             String dateString = dateObj.format(dayMonthYearTimeFormat);
             result += dateString + "\n";
         }
         return result;
     }

     public String ShowAllowMoves(){
         DateTimeFormatter dayMonthYearTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String result = "Разрешено пройти: \n";
         for (LocalDateTime dateObj: allowMovesList) {
             String dateString = dateObj.format(dayMonthYearTimeFormat);
             result += dateString + "\n";
         }
         return result;
     }

     public  int CountBlockMoves()
     {

         return blockMovesList.size();
     }

     public  int CountAllowMoves()
     {

         return allowMovesList.size();
     }
     public ArrayList<LocalDateTime> GetAllowMoves(){
         return allowMovesList;
     }

     public ArrayList<LocalDateTime> GetBlockMoves() {
         return blockMovesList;
     }

     public int GetId() {
         return id;
     }

     public boolean GetIsPilga() {
         return isPilga;
     }

     public void SetIsPilga(boolean discount) {
         isPilga = discount;
     }

     public boolean GetIsNotBlocked() {
         return isNotBlocked;
     }

     public void SetIsNotBlocked(boolean active) {
         isNotBlocked = active;
     }

     public void AddBlockMoves(){
         blockMovesList.add(LocalDateTime.now());
     }

    public void AddAllowMoves(){
         allowMovesList.add(LocalDateTime.now());
    }


 }

