import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class TimeTramCard extends TramCard {
    private int days;
    private LocalDateTime fromDate;

    TimeTramCard(int Id,  boolean  IsPilga, int Days) {
         super(Id, IsPilga);
         this.fromDate = LocalDateTime.now();
         this.days = Days;
     }
    TimeTramCard(int Id,  boolean  IsPilga, int Days, LocalDateTime Setdate) {
        super(Id, IsPilga);
        this.fromDate = Setdate;
        this.days = Days;
    }
    @Override //метод обозначен в абстрактном классе
    boolean GoThroughTurniket() {
        if (((TimeTramCard) this).GetHowManyDaysLeft() > 0) {
            System.out.print(CardInfo());
            return true;
        } else {
            System.out.println(" Внимание - срок действия карты истек, проезд запрещен" );
             return false;
        }
    }

    @Override //метод обозначен в абстрактном классе
    String CardInfo() {
        return "Остаток дней: " + ((TimeTramCard) this).GetHowManyDaysLeft();
    }



     public int GetHowManyDaysLeft(){
         DateTimeFormatter dayMonthYearTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
         LocalDateTime today = LocalDateTime.now();
         int daysActive;
         if (today.getMonth() == fromDate.getMonth() && fromDate.getYear()==today.getYear()) {
             try {
                 fromDate.format(dayMonthYearTimeFormat);
                 today.format(dayMonthYearTimeFormat);
             } catch (Exception e) {
                 e.printStackTrace();
             }

             daysActive = today.getDayOfMonth() - fromDate.getDayOfMonth();
         } else {
             return 31;
         }
         return  days- daysActive;
     }

     public int GetDays() {
         return days;
     }
     public void SetDays(int days) {
         this.days = days;
     }

     public String GetFromDate() {
         DateTimeFormatter dayMonthYearTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String dateString = fromDate.format(dayMonthYearTimeFormat);
         return "Создана " + dateString;
     }
}
