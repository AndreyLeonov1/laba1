 public class Turniket {
    private Register register;

    public Turniket(Register register){
        this.register = register;
    }

     public void AllowMovement(TramCard card){
        System.out.print(" Пропустить.");
        if(card.GetIsPilga()){ System.out.print(" Внимание - Льготный билет.");}
         System.out.println("");
        card.AddAllowMoves();
    }
     public void BlockMovement(TramCard card){
        card.AddBlockMoves();
    }
     public boolean CheckCard(TramCard card) //прохождение через турникет пассажира
     {
         if (card != null && register.IsRegisterContain(card)) {
             System.out.print(" Номер карты: " + card.GetId());
             if (card.GetIsNotBlocked()) {
                 if (card.GoThroughTurniket()) //для каждогo типа карты своя особенность прохода
                 {
                     AllowMovement(card);
                     return true;
                 } else {
                     BlockMovement(card);
                     return false;
                 }
             } else {
                 System.out.println(" Внимание - карта заблокирована");
                 BlockMovement(card);
                 return false;
             }

         } else {
             System.out.println(" Внимание - карты нет в системе, проход запрещен");
             return false;
         }
     }
  }



