import org.junit.Assert;
import java.time.LocalDateTime;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDateTime;
class TurniketTest {

    @org.junit.jupiter.api.Test
    void checkTramCard_Not_in_register(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new NumberTramCard(12336611, true, 4);
        boolean expected = false;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }


    @org.junit.jupiter.api.Test
    void checkNumberTramCard_0_rides(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new NumberTramCard(12336611, true, 0);
        register.AddInRegister(card);
        boolean expected = false;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }

    @org.junit.jupiter.api.Test
    void checkNumberTramCard_Some_rides(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new NumberTramCard(32442354, true, 4);
        register.AddInRegister(card);
        boolean expected = true;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }

    @org.junit.jupiter.api.Test
    void checkMoneyTramCard_0_balance(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new MoneyTramCard(1234, 0, 8);
        register.AddInRegister(card);
        boolean expected = false;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }

    @org.junit.jupiter.api.Test
    void checkMoneyTramCard_Some_balance(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new MoneyTramCard(1234, 100, 8);
        register.AddInRegister(card);
        boolean expected = true;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }

    @org.junit.jupiter.api.Test
    void checkTimeTramCard_0_days(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new TimeTramCard(1356856, false,
                2, LocalDateTime.parse("2020-05-23T10:45:30"));
        register.AddInRegister(card);
        boolean expected = false;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }

    @org.junit.jupiter.api.Test
    void checkTimeTramCard_Some_days(){
        Register register = new Register(); Turniket turniket = new Turniket(register);
        TramCard card = new TimeTramCard(3333333, false, 14);
        register.AddInRegister(card);
        boolean expected = true;
        boolean real = turniket.CheckCard(card);
        Assert.assertEquals( expected, real);
    }








}