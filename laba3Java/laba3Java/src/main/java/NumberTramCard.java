 class NumberTramCard extends TramCard {
    private int rides;

     NumberTramCard(int Id, boolean isPilga, int Rides) {
         super(Id, isPilga);
         rides = Rides;
     }

     @Override //метод обозначен в абстрактном классе
     boolean GoThroughTurniket() {
         if (((NumberTramCard) this).GetRidesLeft() > 0) {
             ((NumberTramCard) this).Ride();
             System.out.print(this.CardInfo());
              return true;
         } else {
             System.out.println(" Внимание - проездов не осталось, проезд запрещен" );
             return false;
         }
     }

     @Override //метод обозначен в абстрактном классе
     String CardInfo() {
         return " Проездов осталось: " + ((NumberTramCard) this).GetRidesLeft() + ".";
     }

     public int GetRidesLeft() {
         return rides;
     }
     public void SetRidesLeft(int ridesLeft) {
         this.rides = ridesLeft;
     }
     public void Ride() {
         this.rides -= 1;
     }
 }
