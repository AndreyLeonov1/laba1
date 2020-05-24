 class MoneyTramCard extends TramCard {
    private int balance;
     private int price;
      MoneyTramCard(int Id, int MoneyAmount, int RidePrice) {
         super(Id, false);
         this.balance = MoneyAmount;
         this.price = RidePrice;
     }

     @Override //метод обозначен в абстрактном классе
     boolean GoThroughTurniket() {
         if (((MoneyTramCard) this).GetBalance() >= price) {
             ((MoneyTramCard) this).DecreaseBalance(price);
             System.out.print(this.CardInfo());
             return true;
         } else {
             System.out.println(" Внимание - недостаточно денег, проезд запрещен." );
             return false;
         }
     }

     @Override //метод обозначен в абстрактном классе
     String CardInfo() {
         return " Остаток на карте:" + ((MoneyTramCard) this).GetBalance() + "грн.";
     }
     public int GetBalance() {
         return balance;
     }

     public void IncreaseBalance(int amount) {
         this.balance += amount;
     }
     public void DecreaseBalance(int amount) {
         this.balance -= amount;
     }




 }
