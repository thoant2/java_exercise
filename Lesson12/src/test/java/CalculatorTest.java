import org.assertj.core.error.ShouldContainOnly;
import org.junit.Test;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @BeforeEach
    public void setUp() {
        System.out.printf("Bắt đầu nào ");
    }

    @AfterEach
    public void tearDown() {
        System.out.printf("Test done");
    }
    @Test
    @DisplayName("Test1")
    public void testArray()
    {
        String[] countries ={"Việt Nam", "Nga", "Mỹ", "Anh"};
        String str = "";
        assertThat(countries).isNotEmpty() // Array is not empty
                .startsWith("Việt Nam")   // start witd
                .doesNotContain("Pháp")
                .contains("Nga")
                .hasSize(4);



    }

    @Test
    @DisplayName("Bai1")
    public void  checkEmail()
    {
        //String strEmail = calculator.inputString();
        String strEmail ="thoant2@onemount.com";
        assertThat(strEmail).isNotEmpty()
                .containsPattern("^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
    }

    @Test
    @DisplayName("Bai2")
    public void checkCanNang()
    {
        String cannang = "45.7 kg";
       // assertThat((float)cannang).isNotZero()
       //         .isBetween(0.3f,500f);
        assertThat(cannang).isNotEmpty()
                    .containsPattern("[0-9]+[\\.0-9 kg]");
    }

    @Test
    @DisplayName("Bai3")
    public void checkCMT()
    {
        String[] arrCMT = {"012345678", "012349567", "012345679", "012345622", "012345633"};
        for (String phantu: arrCMT)
        {
            assertThat(phantu).isNotNull()
                    .containsOnlyDigits()
                    .hasSize(9);
        }
    }
}