import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")

    public void test (int amount, boolean isRegistered, int expected ) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, isRegistered);

        Assertions.assertEquals(expected, actual);
    }

}
