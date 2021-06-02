import org.junit.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


public class DemoTest {
    @Test
    public void testArray()
    {
        String[] countries ={"Việt Nam", "Nga", "Mỹ", "Anh"};
        assertThat(countries).isNotEmpty() // Array is not empty
                .startsWith("Việt Nam")   // start witd
                .doesNotContain("Pháp")
                .contains("Nga")
                .hasSize(4);

    }
}
