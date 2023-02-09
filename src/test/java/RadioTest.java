import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio(30);

        radio.setCurrentStation(18);

        int expected = 18;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}